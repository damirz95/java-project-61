package srs.utils;
import java.util.LinkedList;

public class Brckets {
    public static boolean isBracketsBalanced(String brackets) {
        if (brackets.length() <= 1) {
            return false;
        }
        String[] items = brackets.split("");
        boolean result = false;
        LinkedList<String> bracketsLinkedList = new LinkedList<String>();
        for (String item : items) {
            if ( item.equals("(")) {
                bracketsLinkedList.add(item);
            }
        }
        return result;
    }
}
