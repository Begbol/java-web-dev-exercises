package exercises.technology.main;

public class Computer extends AbstractEntity{

    private int screenWidth;
    private int screenHeight;
    private String manufactureYear;

    public Computer(int screenWidth, int screenHeight, String manufactureYear){
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufactureYear = manufactureYear;

    }

    public int processTwoPlusTwo(){
        return 2 +2;
    }

    public int getScreenWidth(){return this.screenWidth; }

    public int getScreenHeight(){return this.screenHeight; }

    public String getManufactureYear(){return this.manufactureYear; }


    public void tellMeAJoke(){
        System.out.println("Why did the computer show up at work late? It had a hard drive!");
    }
}
