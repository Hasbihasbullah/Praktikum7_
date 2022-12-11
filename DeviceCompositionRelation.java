public class DeviceCompositionRelation {
    private final String brand;
    private final String CPU;
    private final String screen;
    private final String dimension;
    private final String weight;
    private final String RAM;
    private final String batteryCapacity;
    private final OperationSystem operationSystem;

    public DeviceCompositionRelation(String oS, String oSVersion, String brand, String CPU, String screen, String dimension, String weight, String RAM, String batteryCapacity) {
        operationSystem = new OperationSystem();
        operationSystem.operationSystem = oS;
        operationSystem.OSVersion = oSVersion;
        this.brand = brand;
        this.CPU = CPU;
        this.screen = screen;
        this.dimension = dimension;
        this.weight = weight;
        this.RAM = RAM;
        this.batteryCapacity = batteryCapacity;
    }

    public void turnOnDevice() {
        operationSystem.turnOnDevice();
    }

    public void turnOffDevice() {
        operationSystem.turnOffDevice();
    }

    public void prepareHomeDisplay() {
        operationSystem.prepareHomeDisplay();
    }

    public void chargeDevice() {
        System.out.println("Charging device " + this.brand);
    }

    public void callPhone() {
        System.out.println("Call someone");
    }

    public void displaySpecification() {
        System.out.println("Specification of " + this.brand + ":");
        System.out.println("1. Brand: " + this.brand);
        System.out.println("2. CPU: " + this.CPU);
        System.out.println("3. Screen: " + this.screen);
        System.out.println("4. Dimension: " + this.dimension);
        System.out.println("5. Weight: " + this.weight);
        System.out.println("6. RAM: " + this.RAM);
        System.out.println("7. Battery Capacity: " + this.batteryCapacity);
    }
}
