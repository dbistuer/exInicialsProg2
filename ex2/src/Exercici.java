import acm.program.CommandLineProgram;

public class Exercici extends CommandLineProgram {

    public void run() {
        int[] nums = new int[] {4, 12 ,-5 ,3 };
        int max = max(nums);
        println("El resultado es " + max);
    }

    public int max(int[] numbers) {
        int max=0;
        boolean isFirstTime =true;
        for (int number: numbers ) {
            if(isFirstTime)
                max = number;
            else{
                if(max<number)
                    max = number;
            }
            isFirstTime = false;
        }
        return max;
    }

    public static void main(String[] args) {
        new Exercici().start(args);
    }
}
