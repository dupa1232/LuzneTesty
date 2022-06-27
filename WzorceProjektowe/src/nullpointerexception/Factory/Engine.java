package nullpointerexception.Factory;

public class Engine {
    protected float capacity;

    public Engine(float capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                '}';
    }
}
