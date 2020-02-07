import acm.program.CommandLineProgram;

public class Exercici extends CommandLineProgram{

    private final static int MAXLENGHT = 200;

    public void run() {
        int number = readInt("Enter a natural number bigger than 1: ");
        if(isPerfect(number))
            println("Is a perfect number");
        else
            println("Is a bullshit of number");
    }

    public boolean isPerfect(int number){
        int[] intArray = new int[MAXLENGHT];
        int arraySum=0;

        initializeArray(intArray);
        getElements(number,intArray);
        if(!(intArray[0] == -1)){
            for(int i=0;i<MAXLENGHT;i++){
                if(intArray[i]!=-1)
                    arraySum += intArray[i];
                else
                    break;
            }
            if(number == arraySum)
                return true;
            else
                return false;
        }else
            return false;
    }

    private void initializeArray(int[] array){
        for(int i =0;i<MAXLENGHT;i++) array[i] = -1;
    }

    private void getElements(int number,int[] intArray){
        int index =0;
        for(int i=(number-1);i>0;i--){
            if(number%i==0){
                intArray[index] = i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        new Exercici().start(args);
    }

}
