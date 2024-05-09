package ir.StringQuestions;

import java.util.ArrayList;
import java.util.List;

public class ListOperation {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("Mohammad");
        name.add("Parsa");
        name.add("Amir");
        name.add("Ziba");
        name.add("Shahla");
        name.add("Hamdollah");

        for (String list: name) {
            System.out.print(list + " ");
        }
    }
}
