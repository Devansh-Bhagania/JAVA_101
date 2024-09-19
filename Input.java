import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        System.out.println("You are " + a + " years old");
        if(a >=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a minor");
        }
        sc.close(); 
    }
}
