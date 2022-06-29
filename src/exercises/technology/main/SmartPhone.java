package exercises.technology.main;

public class SmartPhone extends Computer{

    private boolean isConnectedTo5G;

    public SmartPhone(int screenWidth, int screenHeight, String manufactureYear, boolean isConnectedTo5G) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    public boolean getIsConnectedTO5G(){return this.isConnectedTo5G; }

    public void makePhoneCall(String number){
        System.out.println("Calling: " + number);
    }
}
