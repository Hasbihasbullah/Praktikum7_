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
