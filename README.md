# Praktikum7_


Nama    : HASBI HASBULLAH
NIM     : 312110094
Kelas   : ti.21.c.1


# RELASI CLASS

- Diagram Class       :


![Diagram class](https://user-images.githubusercontent.com/92858927/206914349-d14056e4-d694-44ec-b150-92f89715fed4.png)

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

