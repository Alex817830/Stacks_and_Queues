package stack.task_1;

public class Reverser {
    private String input;                   //Входная строка
    private String output;                  //Выходная строка

    public Reverser(String in){
        input = in;
    }

    public String doRev(){
        int stackSize = input.length();     //Определить размер стека
        StackX theStack = new StackX(stackSize);    //Создание стека

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);      //Чтение символов из исходного потока
            theStack.push(ch);              //Занесение в стек
        }
        output = "";
        while (!theStack.isEmpty()){
            char ch = theStack.pop();       //звлечение символа из стека
            output = output + ch;           //Присоединение к выходной строке
        }
        return output;
    }
}
