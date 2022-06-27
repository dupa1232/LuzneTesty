package refactoringGuru.observer.listeners;

import java.io.File;

/*
Wspólny interfejs obserwatora.
 */
public interface EventListener {
    void update(String eventType, File file);
}
