public class Hello {
    public static void main(String[] args) {

 feature/Uc4
        if (args.length == 0) {
            System.out.println("Hello, World");
        } else {
            System.out.print("Hello, ");

            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);

                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }
        }

        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name);
main
    }
}