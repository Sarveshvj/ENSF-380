public class Ex13_3 {
    /**
     @param args Handles an optional command-line argument
     */
    public static void main(String[] args) {
        try{
            if(args.length == 0) {
                throw new NotArgumentException();
            }
            System.out.print("This is a placeholder for ");
            for (int i = 0; i < args.length; i++)
                System.out.print(args[i] + " ");
            System.out.println();
        }
        catch (NotArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}

class NotArgumentException extends Exception {
    public NotArgumentException() {
        super("No comment-line argument.");
    }
}
