import acm.program.CommandLineProgram;

public class Exercici extends CommandLineProgram {

    private final static int ARRAYLENGTH = 4;
    public void run() {
        char[] characters = new char[ARRAYLENGTH];
        characters[0]='a';characters[0]='b';characters[0]='c';characters[0]='d';
        characters = removeExtrems(characters);
        print("El resultado es ");
        for (char charcter:characters) {
            print(charcter);
        }
    }

    public char[] removeExtrems(char[] chars) {
        char[] characters = new char[ARRAYLENGTH-2];
        int index =0;
        for (int i=1;i<ARRAYLENGTH-1;i++) {
            characters[index]= chars[i];
           index++;
        }
        return characters;
    }

    public static void main(String[] args) {
        new Exercici().start(args);
    }
}
