package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide an arbitrary number of integers");
        }
    }

    private static int addArguments(String[] args) {
      
        int temp = 0;
        
        for(int i = 0; i < args.length ; i++)
        {
            temp += Integer.valueOf(args[i]);
        }
    
        return temp;
    
    }
}
