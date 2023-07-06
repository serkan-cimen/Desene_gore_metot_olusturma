import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int number = scan.nextInt();
        recursiveMethod(number, number, -1);
   }

   static void recursiveMethod(int constantNumber, int variableNumber, int mark) {
        if (variableNumber > constantNumber)
            return;
        if (variableNumber < 1) mark *= -1;
       System.out.print(" " + variableNumber + " ");
       recursiveMethod(constantNumber, variableNumber + mark * 5, mark);
   }
}