public class Counter {
    private static int activeInstances = 0;
    private static final int MAX_INSTANCES = 5;
    private static int idGenerator = 1;

    private int id;
    private int value;

    public Counter() {
        if (activeInstances >= MAX_INSTANCES) {
            throw new IllegalStateException("Cannot create more than " + MAX_INSTANCES + " Counter instances.");
        }
        this.id = idGenerator++;
        this.value = 0;
        activeInstances++;
        System.out.println("Counter #" + id + " created.");
    }

    // Method to increment the counter
    public void increment() {
        value++;
    }

    // Method to reset the counter to zero
    public void reset() {
        value = 0;
    }

    // Method to get current counter value
    public int getValue() {
        return value;
    }

    // Get counter ID
    public int getId() {
        return id;
    }

    // Static method to get total active instances
    public static int getActiveInstances() {
        return activeInstances;
    }

    public static void main(String[] args) {
        try {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
            Counter c4 = new Counter();
            Counter c5 = new Counter();

            // Uncommenting this will throw an exception
            Counter c6 = new Counter();

            c1.increment();
            c1.increment();
            c2.increment();

            System.out.println("Counter #" + c1.getId() + " value: " + c1.getValue());
            c1.reset();
            System.out.println("Counter #" + c1.getId() + " value after reset: " + c1.getValue());

            System.out.println("Total active Counter instances: " + Counter.getActiveInstances());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
