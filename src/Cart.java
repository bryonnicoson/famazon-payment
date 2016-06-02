public class Cart {

    public static void sayHello() {
        System.out.println("Welcome to Famazon Cart! Enjoy!\n");
    }

    public static void sayGoodbye() {
        System.out.println("Thank you for using Famazon Cart!  Goodbye!\n");
    }

    public static void main(String[] args) {

        System.out.print("\033\143");

        sayHello();

        boolean doWeHaveArguments = false;

        if(args.length > 0) {
            doWeHaveArguments = true;
        }

        if (doWeHaveArguments == true) {
            System.out.print("You make a good argument when you say, ");

            for (int i = 0; i < args.length; i++) {
                System.out.print("'" + args[i] + "' ");
            }

            System.out.println("\n");

        } else {
            System.out.println("What, don't feel like arguing today?\n");

        }

        sayGoodbye();
    }
}