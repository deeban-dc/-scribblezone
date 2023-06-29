import java.util.Scanner;
class WiproPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int larg1 = largest(num1);
        int larg2 = largest(num2);
        int larg3 = largest(num3);

        int seclarg1 = secLargest(num1);
        int seclarg2 = secLargest(num2);
        int seclarg3 = secLargest(num3);

        int sumofLargestofEach = larg1 + larg2 + larg3;
        int sumofSecLargofEach = seclarg1+seclarg2+seclarg3;
        System.out.println(sumofLargestofEach);
        System.out.println(sumofSecLargofEach);
        int ans = sumofLargestofEach + sumofSecLargofEach;

        System.out.println(ans);



    }

    private static int largest(int num1) {
        String strnum1 = String.valueOf(num1);

        int largest = 0;
        int seclargest = 0;
        for (int i = 0; i < strnum1.length(); i++) {
            int currentDigit = Character.getNumericValue(strnum1.charAt(i));
            if (currentDigit > largest) {
                seclargest = largest;
                largest = currentDigit;
            } else if (currentDigit < largest && currentDigit > seclargest) {
                seclargest = currentDigit;
            }
        }
        return largest;
    }

    private static int secLargest(int num1) {
        String strnum1 = String.valueOf(num1);

        int largest = 0;
        int seclargest = 0;
        for (int i = 0; i < strnum1.length(); i++) {
            int currentDigit = Character.getNumericValue(strnum1.charAt(i));
            if (currentDigit > largest) {
                seclargest = largest;
                largest = currentDigit;
            } else if (currentDigit < largest && currentDigit > seclargest) {
                seclargest = currentDigit;
            }
        }
        return seclargest;


    }
}