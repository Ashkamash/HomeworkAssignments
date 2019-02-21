import java.util.Scanner;

public class Assign4 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String input = reader.nextLine();
        while (!input.equals("quit")&&!input.equals("exit")){
            String[] splitInput = input.split("\\s+");
            for(int i = 0; i<splitInput.length;i++){
                if (splitInput[i].equals("Wyatt"))
                    System.out.println("Grandmas");
                else if (splitInput.equals("pizza"))
                    System.out.println("Pizza Party Fridays");
                else if (splitInput.equals("chocolate"))
                    System.out.println("Delicious");
                else if (splitInput.equals("Garrett"))
                    System.out.println("Paid");
                else if (splitInput.equals("Dave"))
                    System.out.println("In on that action");
                else
                    System.out.println("Invalid Response");
                }
            System.out.println("Enter another phrase:");
            input = reader.nextLine();
        }

    }
}
