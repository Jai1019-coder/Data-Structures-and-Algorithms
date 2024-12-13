import java.util.Scanner;

public class numberinwords {
    static String word = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int digit = (int)(Math.log(num)+1);
        System.out.println(numInWords(num, digit));
    }
    public static String numInWords(int n, int digit){
        if(n == 0) return word;
        int firstDigit = (int)(n/(Math.pow(10, digit)));
        switch (firstDigit) {
            case 0: word+="zero";                    
                break;
            case 1: word+="one";
                break;
            case 2: word+="two";
                break;
            case 3: word+="three";
                break;
            case 4: word+="four";
                break;
            case 5: word+="five";
                break;
            case 6: word+="six";
                break;
            case 7: word+="seven";
                break;
            case 8: word+="eight";
                break;
            case 9: word+="nine";
                break;
            default:
                break;
        }                                                                                                                                                                                                                   
        numInWords(n-(int)(firstDigit*(Math.pow(10, digit))), firstDigit);
        return word;
    }
}

