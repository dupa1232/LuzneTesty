package refactoringGuru.observer.listeners;

import java.io.File;

/*
Wsp�lny interfejs obserwatora.
 */
public interface EventListener {
    void update(String eventType, File file);
}
