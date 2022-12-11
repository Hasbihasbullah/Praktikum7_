# Praktikum7_


Nama    : HASBI HASBULLAH
NIM     : 312110094
Kelas   : ti.21.c.1


# RELASI CLASS

- Diagram Class       :


![Diagram class](https://user-images.githubusercontent.com/92858927/206914349-d14056e4-d694-44ec-b150-92f89715fed4.png)



Source code     :

OperationSystem.java
public interface IOperationiSystem {
    void turnOnDevice();
    void turnOffDevice();
    void prepareHomeDisplay();
}


IOperationSystem.java
public class OperationSystem implements IOperationiSystem {
    public String operationSystem;
    public String OSVersion;

    @Override
    public void turnOnDevice() {
        System.out.println("Turning on device...");
    }

    @Override
    public void turnOffDevice() {
        System.out.println("Turning off device...");
    }

    @Override
    public void prepareHomeDisplay() {
        System.out.println("Preparing home display...");
    }
}



public class DeviceAggregationRelation {
    private String brand;
    private String CPU;
    private String screen;
    private String dimension;
    private String weight;
    private String RAM;
    private String batteryCapacity;
    private final OperationSystem operationSystem;

    public DeviceAggregationRelation(OperationSystem oS) {
        operationSystem = oS;
    }

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


public class MainDeviceAggregationRelation {
    public static void main(String[] args) {
        // Membuat object oporation system
        OperationSystem oS = new OperationSystem();

        // memanggil atribut dan nilai
        oS.operationSystem = "Android Operation System";
        oS.OSVersion = "Android 11";

        // Membuat object Device
        DeviceAggregationRelation samsungS9 = new DeviceAggregationRelation(oS);
        samsungS9.setBrand("Samsung");
        samsungS9.setCPU("Octa-core (2x2.3 GHz Kryo 470 Gold & 6x1.8 GHz Kryo 470 Silver)");
        samsungS9.setScreen("AMOLED 6,55 inci (1.080 x 2.400 piksel), HDR 10, refresh rate 90 Hz, Gorilla Glass 5, aspek rasio 20:9");
        samsungS9.setDimension("160,5 x 75,7 x 6,8 mm");
        samsungS9.setWeight("157 gram");
        samsungS9.setRAM("64 GB");
        samsungS9.setBatteryCapacity("3.600 mAh (Fast Charging 16 Watt)");
        samsungS9.turnOnDevice();
        samsungS9.prepareHomeDisplay();
        samsungS9.chargeDevice();
        samsungS9.callPhone();
        samsungS9.displaySpecification();
        samsungS9.turnOffDevice();
    }
}
