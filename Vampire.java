import java.util.Random;

public class Vampire
{
    public String Name;
    public int Health;
    
    public Vampire Bite(Human human) {
        System.out.println(Name + " just bit " + human.Name);
        String newName = human.Name + "cula";
        return new Vampire(newName);
    }
    
    public int Bite(Vampire vamp){
        Random rand = new Random();
        int damage = rand.nextInt(5) + 1;
        vamp.Health = vamp.Health - damage;
        System.out.println(Name + " just bit " + vamp.Name);
        System.out.println("Damage was " + damage);
        if (vamp.Health <= 0) {
            System.out.println(vamp.Name + " died.");
        }
        return vamp.Health;
    }
    
    public Vampire(String name)
    {
        Name = name;
        Health = 10;
        System.out.println("New Vampire created named " +
            Name + "!"); 
        }
}
