package hero;

public abstract class Hero {
    protected String name; // ini hanya bisa diakses oleh subclass dari hero
    private int level;
    public Hero(String name){
        this.name = name;
    }

    public abstract void display();

    protected String getName(){
        String str = "Name : " + this.name + " - " + this.level;

        return str;
    }

    protected void setName(String name){
        this.name = name;
    }


}
