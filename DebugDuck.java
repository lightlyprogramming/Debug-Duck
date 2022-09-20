import java.util.Scanner;
import java.util.Random;

public class DebugDuck {

    Scanner scan = new Scanner(System.in);
    Random rand  = new Random();

    boolean floatable;
    int age;
    double weight;
    String color;
    String name;
    boolean hasObject;
    String object;
    
    public  void debugDuck(boolean f, int a, double w, String c, String n, boolean o){
        floatable = f;
        age = a;
        weight = w;
        color = c;
        name = n;
        hasObject = o;
       if(o == true){
        System.out.println("\nInput object description:\n");
        String ob = scan.nextLine();
        object = ob;
       } 
    }

    public void duckInfo(){
        System.out.println("Printing duck info...");
        System.out.println("Is floatable? " + floatable);
        System.out.println("Age: " + age);
        System.out.println("Weight  (in oz): " + weight);
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
        System.out.println("Has object: " + hasObject);
        if(hasObject == true){
            System.out.println("Object description: " + object);
        }
    }

    public void squeak(){
        System.out.println("Squeak, squeak...");
    }

    public void emotionalSupport(){
        String[] support = new String[15];
        support[0] = "You can do it!";
        support [1] = "You deserve someone!";
        support[2] = "Believe in yourself!";
        support[3] = "Struggle productively!";
        support[4] = "You're doing amazing!";
        support[5] = "I'm so proud of you!";
        support[6] = "We're here for you!";
        support[7] = "Take deep breathes!";
        support[8] = "Count to 10!";
        support[9] = "Don't give up!";
        support[10] = "It's ok to fail!";
        support[11] = "It will get better!";
        support[12] = "We love you!";
        support[13] = "It gets better!";
        support[14] = "Take care of yourself!";

        for(int i = 0;  i < 3; i++ ){
            System.out.println(support[rand.nextInt(15)]);
            System.out.println();
        }
    }

    public void listen(){
        System.out.println("Listening!");
    }

    public void stare(){
        System.out.println("*stares menacingly*");
    }

    public void floaty(){
        if(floatable == true){
            System.out.println("I can float!");
        } else {
            System.out.println("Oh no, I sank!");
        }
    }

    public void doEverything(){
        duckInfo();
        stare();
        squeak();
        listen();
        emotionalSupport();
        floaty();
        
    }
}