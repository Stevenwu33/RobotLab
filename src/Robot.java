public class Robot {

    int batteryLevel = 100;
    int speed = 0;
    String name = "Robo";
    String color = "silver";
    int weight = 20;
    int year = 2008;



    public void move(){
        speed = 5;
        System.out.println(name + "is moving at speed\n" + speed + " mph.");
    }

    public void stop(){
        speed = 0;
        System.out.println(name + " has stopped.");
    }

    public void chargeBattery(){
        batteryLevel = 100;
        System.out.println(name + "'s battery is fully charged.");
    }

    public void checkBatteryLevel(){
        System.out.println(name + "'s battery level is " + batteryLevel);
    }

    public void displayInfo(){
        System.out.println("Robot Info: " + name + " - " + color + " - " + weight + "lb's" + " - " + year);

    }

    public void newLine(){
        System.out.println("Robot info: \n" + name +"\n"+ color +"\n"+ weight +"\n"+ year);
    }


}
