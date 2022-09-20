public class main {
    public static void main(String[] args){

        DebugDuck duck1 = new DebugDuck();
        DebugDuck duck2 = new DebugDuck();

        duck1.debugDuck(true, 6, 5.75, "Purple", "Quackster McGee",  true);
        duck1.duckInfo();
        duck1.emotionalSupport();
        duck1.squeak();
        duck1.listen();
        duck1.stare();
        duck1.floaty();

        System.out.println("\n\n\n");
        duck2.debugDuck(false, 18, 3.0, "Blue", "Soapy", false);
        duck2.doEverything();

        System.out.println("\n\n\n");


    }
}