import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Eligible elig = new Eligible();
        Scanner sc = new Scanner(System.in);
        elig.age = sc.nextInt();
        elig.vote();

    }
}
class Eligible{
    int age;
    void vote() {
        if( age<18)
        {
            System.out.println("Not Eligible to Vote");
        }
        else {
            System.out.println("Eligible to Vote");
        }

    }
}