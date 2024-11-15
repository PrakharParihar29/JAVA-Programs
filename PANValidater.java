import java.util.regex.*;
import java.util.Scanner;

class PANValidater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your PAN number: ");
        String s1 = sc.nextLine();

        Pattern p = Pattern.compile("[A-Z]{3}[PCATFH]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}");
        Matcher m = p.matcher(s1);

        if(m.matches())
            System.out.println("PAN number is Valid");
        else
            System.out.println("PAN number is Invalid");
    }
}
