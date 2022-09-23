package Lesson5;

public class WA implements interfac  {
    @Override
    public void sendMessages(String from, String to, String message) {
        System.out.println("  " + message + "  FROM " + from + " TO " + to + "BY WA");
        return;
    }
}
