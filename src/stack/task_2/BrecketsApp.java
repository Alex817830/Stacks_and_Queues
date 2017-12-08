package stack.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrecketsApp {
    public static void main(String[] args) throws IOException{
        String input;
        while (true){
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if (input.equals("")){
                break;
            }
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();                                     //Проверка парных скобок
        }
    }
    public static String getString() throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        return s;
    }
}
