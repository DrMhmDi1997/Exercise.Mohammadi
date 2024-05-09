package ir.Interface2024;

public class Message implements Printable, Showable{
    @Override
    public void print() {
        System.out.println("Hello every one, Mammad is talking");
    }

    @Override
    public void show() {
        System.out.println("It will be shown via Skype");
    }
}
