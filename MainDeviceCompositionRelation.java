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