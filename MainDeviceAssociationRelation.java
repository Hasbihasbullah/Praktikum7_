
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