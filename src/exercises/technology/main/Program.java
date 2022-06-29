package exercises.technology.main;

public class Program {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone(1500, 500, "2021", true);
//        mySmartPhone.makePhoneCall("413-303-0331");
//        int result = mySmartPhone.processTwoPlusTwo();
//        System.out.println("The result is: " + result);
        System.out.println(mySmartPhone.getId());

        Laptop myLaptop = new Laptop(2500, 1500, "2021");
//        myLaptop.openIntelliJ();
//        int result = myLaptop.processTwoPlusTwo();
//        System.out.println("Laptop result is: " + result);
        System.out.println(myLaptop.getId());

        Computer myComputer = new Computer(3800, 3000, "2021");
//        int computerResult = myComputer.processTwoPlusTwo();
//        System.out.println("Computer result is: " + computerResult);
        System.out.println(myComputer.getId());

    }
}
