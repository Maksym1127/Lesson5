package Lesson5;

public class Messenger {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        WA wa = new WA();
        Telegram telegram = new Telegram();
        wa.sendMessages("МАкс", "Вася", "Pryvit!!");
        telegram.sendMessages("МАкс", "Вася", "Pryvit!!");
        facebook.sendMessages("МАкс", "Вася", "Pryvit!!");

    }
}
