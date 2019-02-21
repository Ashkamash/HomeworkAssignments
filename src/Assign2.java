import java.util.Scanner;

public class Assign2{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String input = reader.nextLine();
        while (!input.equals("quit")&&!input.equals("Quit")&&!input.equals("stop")&&!input.equals("quit") ) {
            if (input.equals("Ash")){
                System.out.println("Zelda");
                System.out.println("Enter another word: ");}
            else if (input.equals("Wyatt")){
                System.out.println("Wyatto-senpai, I weawwy appweciate this");
                System.out.println("Enter another word: ");}
            else if (input.equals("Garret")) {
                System.out.println("Jarrodg");
                System.out.println("Enter another word: ");}
            else if (input.equals("Sarah")){
                System.out.println("Married in October");
                System.out.println("Enter another word: ");}
            else if(input.equals("Jake")){
                System.out.println("Absent lol");
                System.out.println("Enter another word: ");}
            else if (input.equals("Shauna")){
                System.out.println("Playing Cookie Clicker");
                System.out.println("Enter another word: ");}
            else
                System.out.println("Answer invalid, enter another word: ");
            input = reader.next();
        }

        reader.close();
    }
}