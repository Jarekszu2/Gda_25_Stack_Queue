package pl.kszafran.sda.algo.exercises;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Exercises5 exercises5 = new Exercises5();

        boolean czyOk = exercises5.balancedParens("((()())");

        System.out.println(czyOk);

        String s = "aaa";
        char[] tab = s.toCharArray();
    }

}
