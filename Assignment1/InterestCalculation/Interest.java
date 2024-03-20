package InterestCalculation;
import java.util.Scanner;


public class Interest implements Calculation{

    @Override
    public void simpleInterest(float p, float r, float t) {

        float si = p*r*t;
        System.out.println("The simple interest is " + si);
    }

    @Override
    public void compoundInterest(float p, float r, float t, float n) {

        float amount = p * (float) Math.pow((1 + r / n), n * t);
        float ci = amount - p;
        System.out.println("The compound interest is " + ci);
    }

    public static void main(String[] args){

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the principal amount: ");
            float p = scanner.nextFloat();
            System.out.print("Enter the annual interest rate : ");
            float r = scanner.nextFloat();
            System.out.print("Enter the time period : ");
            float t = scanner.nextFloat();
            System.out.print("Enter the number of time interest compounded : ");
            float n = scanner.nextFloat();
            if(p==0 || r==0 || t==0 || n==0){
                throw  new CustomException("The values cannot be null");
            }
            Interest interest = new Interest();
            interest.simpleInterest(p,r,t);
            interest.compoundInterest(p,r,t,n);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
