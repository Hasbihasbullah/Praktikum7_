

public class DeviceAssociationRelation {
    private String brand;
    private String CPU;
    private String screen;
    private String dimension;
    private String weight;
    private String RAM;
    private String batteryCapacity;
    OperationSystem operationSystem;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOperationSystem(OperationSystem os) {
        operationSystem = os;
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
