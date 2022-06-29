package exercises.technology.main;

public class Laptop extends Computer{


    private boolean isIntelliJOpened;

    public Laptop(int screenWidth, int screenHeight, String manufactureYear) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpened = false;
    }
    public Laptop(int screenWidth, int screenHeight, String manufactureYear, boolean isIntelliJOpened) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpened = isIntelliJOpened;
    }

    public boolean getIsIntelliJOpened(){return this.isIntelliJOpened; }

    public void setIsIntelliJOpened(boolean isIntelliJOpened){this.isIntelliJOpened = isIntelliJOpened;}

    public void openIntelliJ(){
        this.isIntelliJOpened = true;
        System.out.println("IntelliJ is now opened!");
    }

}
