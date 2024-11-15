import java.util.regex.*;
import java.util.Scanner;

class EmailIdValidater {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("^[a-zA-Z][a-zA-Z0-9._]*[a-zA-Z0-9]+@[a-z]+[\\.][a-z]{2,3}$","pariharPrakhar5@gmail.com"));
        // ^[a-zA-Z] Strating word will be from this range(Prakhar)
        // [a-zA-Z0-9._]* Zero or more occurences from this range or . or _ (_or.)
        // [a-zA-Z0-9]+ one or more occurence from this range(Parihar2911)
        // @ meance occurence of @ at that place (@)
        // [a-z]+ one or more occurence from range (gmail)
        // //. used for dot(.) at that place (.)
        // [a-z]{2,3} two or three occurence from range(com or in)
        // $ end of String
        // (Prakhar_Parihar@gmail.com)
    }
}