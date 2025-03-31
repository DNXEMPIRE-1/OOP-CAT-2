public class ApplianceDemo {
    public static void main(String[] args) {
        // Demonstrate abstraction
        Appliance fan = new Fan();
        Appliance tv = new TV();
        
        fan.turnOn();
        tv.turnOn();
    }
}
