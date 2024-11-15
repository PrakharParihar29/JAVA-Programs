import java.util.Scanner;  
class Swastik {  
    public static void main (String[] args)  {  
        int rows, cols;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Please enter odd numbers for rows and colums to get perfect Swastika.");  
        System.out.println("Enter total rows");  
        rows = sc.nextInt();  
        System.out.println("Enter total colums");  
        cols = sc.nextInt(); 
        sc.close();  
          
        swastika(rows, cols);  
    }  
    static void swastika(int rows, int cols){
        int rmid = (rows/2)+1;
        int cmid = (cols/2)+1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == rmid || j == cmid) {
                    System.out.print("*");
                } else if ((i < rmid && j == 1) || (i > rmid && j == cols)) {
                    System.out.print("*");
                } else if ((i == 1 && j > cmid) || (i == rows && j < cmid)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}