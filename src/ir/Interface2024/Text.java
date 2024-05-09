package ir.Interface2024;

public class Text implements Printable, Showable{
    @Override
    public void print() {
        System.out.println("He is 26 and wishes to be a programmer");
    }

    @Override
    public void show() {
        System.out.println("It will be shown via Telegram");
    }
}
