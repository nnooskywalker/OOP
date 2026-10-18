package Hero;

public abstract class hero {
    protected String name;
    protected int health;

    public hero(String name, int health){
        this.name = name;
        this.health = health;
    }

    public abstract void display();
    
}
