package srs;
import Brckets.isBracketsBalanced;
public class App {
    public static void main(String[] args) {
        String  brakets = "()()()";
        boolean result = brakets.isBracketsBalanced();
        System.out.println(result);
    }
}
