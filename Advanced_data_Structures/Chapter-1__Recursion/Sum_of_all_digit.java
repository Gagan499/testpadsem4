import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static int sumOfDigits(int n)
    {
        if(n<0){
            return -sumOfDigits(-n);
        }
       if(n <10){
        return n;
       }
       return (n%10) + sumOfDigits(n/10);
    }  
    public static void main(String[] args)
    {
        // Write your code here
        java.util.Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int no;     
        while(test>0){
            no = sc.nextInt();
            System.out.println(sumOfDigits(no));
            test--;
        }
        sc.close();
    }
}.,