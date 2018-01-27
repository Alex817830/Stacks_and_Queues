package stack.task_2;

public class BracketChecker {
//    private String input;       //Входная строка
//
//    public BracketChecker(String input){
//        this.input = input;
//    }
//
//    public void check(){
//        int stackSize = input.length();
//        StackX theStack = new StackX(stackSize);
//
//        for (int j = 0; j < input.length(); j++) {  //Последовательность чтения
//            char ch = input.charAt(j);              //Чтение символов
//
//            switch (ch){
//                case '{':               //Открывающие скобки
//                case '[':
//                case '(':
//                    theStack.push(ch);  //Занести в стек
//                    break;
//
//                case '}':               //Закрывающие скобки
//                case ']':
//                case ')':
//                    if (!theStack.isEmpty()){
//                        char chx = theStack.pop();  //Извлечь и проверить
//                        if((ch == '}' && chx !='{')||
//                             (ch == ']' && chx !='[')||
//                                (ch == ')' && chx !='(')){
//                            System.out.println("Error: "+ch+" at " +j);
//                        }
//                        else
//                            System.out.println("Error: "+ch+" at "+j);
//                        break;
//                    }
//                    default:
//                        break;
//            }
//
//        }
//        if (!theStack.isEmpty()){
//            System.out.println("Error: missing right delimiter");
//        }
//    }
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()){
                        char chx = theStack.pop();
                        if ((ch == '}' && chx!='{') ||
                                (ch == ']' && chx !='[') ||
                                (ch == ')' && chx !='('))
                            System.out.println("Error: "+ch+" at "+j);
                    }
                    else
                        System.out.println("Error: "+ch+" at "+j);
                    break;
                    default:
                        break;


            }
        }
        if (!theStack.isEmpty()){
            System.out.println("Error: missing right delimiter");
        }

    }

}
