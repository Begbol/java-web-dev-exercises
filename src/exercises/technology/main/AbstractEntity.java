package exercises.technology.main;

public abstract class AbstractEntity {

    private int id;
    private static int nextID = 1;

    public  AbstractEntity(){
        this.id = nextID;
        nextID++;
    }

    public int getId(){return this.id; }

}
