public class Ex13_1 {
    /**
     @param args Handles an optional command-line argument
     */
    public static void main(String[] args) throws Exception {
        if(args.length == 0) {
            throw new NoArgumentException();
        }

        System.out.print("This is a placeholder for ");
        for (int i = 0; i < args.length; i++)
            System.out.print(args[i] + " ");
        System.out.println();
    }
}

class NoArgumentException extends Exception {
    public NoArgumentException() {
        super("No comment-line argument.");
    }
}
