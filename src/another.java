import java.util.Scanner;

public class another {
    static int a;
    static int b;
    static int c;

    public static void main(String[] args) {
        System.out.println("Enter the the numbers");
        Scanner r = new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is the largest among all the three numbers");
            }
            else
            {
                System.out.println(a+" is not the largest among all the three numbers");
            }
        }
        else if(b>c)
        {
            if(b>a)
            {
                System.out.println(b+" is the largest among all the three numbers");
            }
            else
            {
                System.out.println(b+" is not the largest among all the three numbers");
            }
        }
        else if(c>a) {
            if (c > b) {
                System.out.println(c+" is the largest among all the three numbers");
            } else {
                System.out.println(c+" is not the largest among all the three numbers");
            }
        }
        else{
            System.out.println("Error");
        }
    }

    }
