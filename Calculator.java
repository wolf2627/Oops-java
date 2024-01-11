import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField display;
    private String operator = "";
    private double firstNumber = 0;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        display = new TextField();
        display.setEditable(false);
        display.setStyle("-fx-font-size: 18;");
        display.setPrefColumnCount(4);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        int col = 0;
        int row = 0;

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.setMinSize(50, 50);
            button.setOnAction(e -> handleButtonClick(label));
            gridPane.add(button, col, row);
            col++;

            if (col > 3) {
                col = 0;
                row++;
            }
        }

        gridPane.add(display, 0, row, 4, 1);

        Scene scene = new Scene(gridPane, 250, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(String value) {
        if ("0123456789.".contains(value)) {
            display.appendText(value);
        } else if ("+-*/".contains(value)) {
            if (!display.getText().isEmpty()) {
                operator = value;
                firstNumber = Double.parseDouble(display.getText());
                display.clear();
            }
        } else if ("=".equals(value)) {
            if (!display.getText().isEmpty()) {
                double secondNumber = Double.parseDouble(display.getText());
                double result;
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                        } else {
                            display.setText("Error: Division by zero");
                            return;
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + operator);
                }
                display.setText(String.valueOf(result));
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}