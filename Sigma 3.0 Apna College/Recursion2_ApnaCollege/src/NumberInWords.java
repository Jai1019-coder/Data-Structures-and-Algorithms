import java.util.Scanner;

public class NumberInWords {
    static String word = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println(convertToWords(num));;
    }
    public static String convertToWords(int n) {
        // Base case: if n becomes 0, return an empty string
        if (n == 0) {
            return "";
        }

        // Recursively call for the next digit (left to right)
        String word = convertToWords(n / 10);

        // Get the word for the current digit (rightmost)
        int digit = n % 10;
        switch (digit) {
            case 0: word += "zero "; break;
            case 1: word += "one "; break;
            case 2: word += "two "; break;
            case 3: word += "three "; break;
            case 4: word += "four "; break;
            case 5: word += "five "; break;
            case 6: word += "six "; break;
            case 7: word += "seven "; break;
            case 8: word += "eight "; break;
            case 9: word += "nine "; break;
            default: break;
        }
        return word;
    }
}


