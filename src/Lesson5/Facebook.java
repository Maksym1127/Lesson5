package Lesson5;

public class Facebook implements interfac {
    @Override
    public void sendMessages(String from, String to, String message) {
        System.out.println("I SENT MASSEGE " + message + "  FROM " + from + " TO " + to + "BY Facebook");
        return;
    }

}
