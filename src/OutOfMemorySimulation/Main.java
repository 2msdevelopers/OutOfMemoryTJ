package OutOfMemorySimulation;

public class Main {

    public static void main(String[] args) throws Exception
    {
        Main leakGenerator = new Main();
        leakGenerator.createArrays();
    }

        public void createArrays()
        {
            System.out.println("Test started");
            int arraySize = 20;

            // Create arrays in an infinite loop
            do
            {
                System.out.println("Pass one memory required: " + arraySize +" bytes");
                System.out.println("Available memory: " + Runtime.getRuntime().freeMemory() +" bytes");
                int[] fillMemory = new int[arraySize];
                arraySize = arraySize * 5;
            } while (true);
        }
    }