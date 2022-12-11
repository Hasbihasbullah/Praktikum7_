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
