

public class Main
{
    public static void main(){
        System.out.println("App started!");
        Vampire mary = new Vampire("Mary");
        Vampire john = new Vampire("John Ceneaaa");
        Human charlie = new Human("Charlie");
        Vampire newVampire = mary.Bite(charlie);
        int maryHealth = john.Bite(mary);
    }
}
