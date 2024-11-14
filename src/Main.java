public class Main {
    public static void main(String[] args) {

        Robot myRobot = new Robot();

        myRobot.move();
        myRobot.stop();
        myRobot.chargeBattery();
        myRobot.checkBatteryLevel();

        myRobot.displayInfo();

        System.out.println("hello\nWorld" );

        myRobot.newLine();


    }
}