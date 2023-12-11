package WeekEleven;

public class Recursion {
    public void countDown(int number) {
        if (number == 0) {
            System.out.print("Go!");
        } else {
            System.out.print(number + "...");
            countDown(number - 1);
        }
    }

    public void alphaBackwards(char letter) {
        if (letter >= 'a') {
            System.out.print(letter + " ");
            alphaBackwards((char)(letter - 1));
        }
    }
}
