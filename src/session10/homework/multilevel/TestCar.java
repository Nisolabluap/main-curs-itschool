package session10.homework.multilevel;

public class TestCar {

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.setMake("Tesla");
        tesla.setModel("Y");
        tesla.setYear(2022);
        tesla.setBatteryCapacity(75);
        tesla.setRange(482);
        tesla.setAutopilotVersion(3);

        System.out.println(tesla);

        tesla.start();
        tesla.enableAutopilot("on.");
        tesla.accelerate();
        tesla.stop();
        tesla.charge();
    }
}