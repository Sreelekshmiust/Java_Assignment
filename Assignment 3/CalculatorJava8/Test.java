import java.util.*;

public class Test{

    public  void calculate(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
       int  b = scanner.nextInt();
        System.out.println("Enter the opteration \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n");
        String choice = scanner.next();
        switch (choice){
            case "1" : Calculator add = Integer::sum;
            float addResult = add.calculator(a,b);
                System.out.println("the result of addition is "+ addResult);
                break;
            case "2" :  Calculator sub = (int num1, int num2) ->num1-num2;
                float subResult = sub.calculator(a,b);
                System.out.println("the result of addition is "+ subResult);
                break;
            case "3" : Calculator multiplication = (int num1, int num2) ->num1*num2;
                float result = multiplication.calculator(a,b);
                System.out.println("the result of addition is "+ result);
                break;
            case "4" : Calculator div = (int num1, int num2) -> (float) num1 /num2;
                float divisionResult = div.calculator(a,b);
                System.out.println("the result of addition is "+ divisionResult);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
