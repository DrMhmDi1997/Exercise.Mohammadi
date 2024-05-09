package ir.StringQuestions;

public class Operation {

    public static void main(String[] args) {

        String introduction = "My name is Mohammad Mohammadi";
        String Ending = "Finish shod";

        System.out.println(introduction);
        System.out.println(introduction.length());
        System.out.println(introduction.substring(6));
        System.out.println(introduction.substring(5, 9));
        System.out.println(introduction.trim());
        System.out.println(introduction.toLowerCase());
        System.out.println(introduction.toUpperCase());
        System.out.println(introduction.startsWith("You are"));
        System.out.println(introduction.endsWith("m"));
        System.out.println(introduction.charAt(7));
        System.out.println(introduction.charAt(17));
        System.out.println(introduction.replace("I", "you"));
        System.out.println(introduction.charAt(28));
        System.out.println(introduction.equalsIgnoreCase(Ending));
        System.out.println(Ending.replace("s", "b"));
        System.out.println(Ending.replace("shod", "Omad"));
        System.out.println(Ending.trim());

    }
}
