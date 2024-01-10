import java.util.*;
import java.io.*;

class FindReplace{
    public static void main(String []arg){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the filepath: ");
        String filepath = s.nextLine();
        System.out.print("Enter the Word to be replaced: ");
        String oldWord = s.nextLine();
        System.out.print("Enter the word to replace with: ");
        String newWord= s.nextLine();
        String line;
        StringBuilder modify = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            while((line = br.readLine()) != null){
                line = line.replaceAll(oldWord, newWord);
                System.out.println(line);

               modify.append(line).append("\n");
            }
            br.close();
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
            bw.write(modify.toString());
            bw.close();

        } catch(Exception e){
            System.out.println(e);
        }
        s.close();
    }
}

