# Praktikum7_


Nama    : HASBI HASBULLAH

NIM     : 312110094

Kelas   : ti.21.c.1


# RELASI CLASS

- Diagram Class       :


![Diagram class](https://user-images.githubusercontent.com/92858927/206914349-d14056e4-d694-44ec-b150-92f89715fed4.png)



# Source code     :

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


# Aggregataion

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

#output!

![Screenshot (142)](https://user-images.githubusercontent.com/92858927/206915630-81a17c3b-30bc-47dd-a82a-4e88cb1c9cd3.png)







# Associasion



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





    public class MainDeviceAssociationRelation {
        public static void main(String[] args) {
            // Membuat object oporation system
            OperationSystem oS = new OperationSystem();

            // memanggil atribut dan nilai
            oS.operationSystem = "Android Operation System";
            oS.OSVersion = "Android 11";

            // Membuat object Device
            DeviceAssociationRelation googlePixel5 = new DeviceAssociationRelation();
            googlePixel5.setOperationSystem(oS);
            googlePixel5.setBrand("Google Pixel");
            googlePixel5.setCPU("Octa-core (2x2.3 GHz Kryo 470 Gold & 6x1.8 GHz Kryo 470 Silver)");
            googlePixel5.setScreen("AMOLED 6,55 inci (1.080 x 2.400 piksel), HDR 10, refresh rate 90 Hz, Gorilla Glass 5, aspek rasio 20:9");
            googlePixel5.setDimension("160,5 x 75,7 x 6,8 mm");
            googlePixel5.setWeight("157 gram");
            googlePixel5.setRAM("128 GB");
            googlePixel5.setBatteryCapacity("4.250 mAh (Fast Charging 33 Watt)");
            googlePixel5.turnOnDevice();
            googlePixel5.prepareHomeDisplay();
            googlePixel5.chargeDevice();
            googlePixel5.callPhone();
            googlePixel5.displaySpecification();
            googlePixel5.turnOffDevice();
        }
    }

#output


![Screenshot (143)](https://user-images.githubusercontent.com/92858927/206915031-6f925610-46ee-439c-bf56-f831aca35a9f.png)





# Composition

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



    public class MainDeviceCompositionRelation {
        public static void main(String[] args) {
            // Membuat object Device
            DeviceCompositionRelation xiaomiLite11 = new DeviceCompositionRelation("Android Operation System", "Android 11", "Xiaomi", "Octa-core (2x2.3 GHz Kryo 470 Gold & 6x1.8 GHz Kryo 470 Silver)", "AMOLED 6,55 inci (1.080 x 2.400 piksel), HDR 10, refresh rate 90 Hz, Gorilla Glass 5, aspek rasio 20:9", "160,5 x 75,7 x 6,8 mm", "157 gram", "128 GB", "4.250 mAh (Fast Charging 33 Watt)");
            xiaomiLite11.turnOnDevice();
            xiaomiLite11.prepareHomeDisplay();
            xiaomiLite11.chargeDevice();
            xiaomiLite11.callPhone();
            xiaomiLite11.displaySpecification();
            xiaomiLite11.turnOffDevice();
        }
    }

#output


![Screenshot (144)](https://user-images.githubusercontent.com/92858927/206915103-68c7f213-39a8-4eb2-90e1-a8d89997ab95.png)





# Dependencies

    public class DeviceDependenciesRelation {
        private String brand;
        private String CPU;
        private String screen;
        private String dimension;
        private String weight;
        private String RAM;
        private String batteryCapacity;

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

        public void turnOnDevice(OperationSystem operationSystem) {
            operationSystem.turnOnDevice();
        }

        public void turnOffDevice(OperationSystem operationSystem) {
            operationSystem.turnOffDevice();
        }

        public void prepareHomeDisplay(OperationSystem operationSystem) {
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

    public class MainDeviceDependenciesRelation {
        public static void main(String[] args) {
            // Membuat object oporation system
            OperationSystem oS = new OperationSystem();

            // memanggil atribut dan nilai
            oS.operationSystem = "Android Operation System";
            oS.OSVersion = "Android 11";

            // Membuat object Device
            DeviceDependenciesRelation asusZenfone7 = new DeviceDependenciesRelation();
            asusZenfone7.setBrand("Asus");
            asusZenfone7.setCPU("Octa-core (2x2.3 GHz Kryo 470 Gold & 6x1.8 GHz Kryo 470 Silver)");
            asusZenfone7.setScreen("AMOLED 6,55 inci (1.080 x 2.400 piksel), HDR 10, refresh rate 90 Hz, Gorilla Glass 5, aspek rasio 20:9");
            asusZenfone7.setDimension("160,5 x 75,7 x 6,8 mm");
            asusZenfone7.setWeight("157 gram");
            asusZenfone7.setRAM("128 GB");
            asusZenfone7.setBatteryCapacity("4.250 mAh (Fast Charging 33 Watt)");
            asusZenfone7.turnOnDevice(oS);
            asusZenfone7.prepareHomeDisplay(oS);
            asusZenfone7.chargeDevice();
            asusZenfone7.callPhone();
            asusZenfone7.displaySpecification();
            asusZenfone7.turnOffDevice(oS);
        }
    }


#output

![Screenshot (145)](https://user-images.githubusercontent.com/92858927/206915119-9d67dd1d-cc3e-456f-8913-379a1bb2bea3.png)



- to be continued




