package refactoringGuru.observer;

import refactoringGuru.observer.editor.Editor;
import refactoringGuru.observer.listeners.EmailNotificationListener;
import refactoringGuru.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("C:\\Users\\User\\Desktop\\loggg.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("jacek@wp.pl"));

        try {
            editor.openFile("test.txt"); /// ta i poni¿sza linijka drukuj± teskst zdefiniowany w
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
