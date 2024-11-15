class NegativeNumberException extends Exception{
    public String toString(){
        return "Please enter only positive values";
    }
}

class CustomException {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            if(a<0||b<0){
                throw new NegativeNumberException();
            }

            System.out.println("The summation of given numbers is: "+(a+b));
            System.out.println("The subtraction of given numbers is: "+(a-b));
            System.out.println("The multiplication of given numbers is: "+(a*b));
            System.out.println("The division of given numbers is: "+(a/b));
        }
        catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println("Please enter two command line arguments");
        }
        catch(NumberFormatException nfe){
            System.out.println("Please enter integer value only");
        }
        catch(ArithmeticException ae){
            System.out.println("Division with zero is not possible");
        }
        catch(NegativeNumberException nne){
            System.out.println(nne);
        }
    }
}
