package ac.za.sean.project4;
import org.junit.Assert;
import org.junit.Test;

public class Project4Test
{
    @Test
    public void testDog()
    {
        Animal animal = new Animal();
        String dog1 = "run";
        String moveReturned = animal.move(dog1);
        Assert.assertEquals("run",moveReturned);
        Dog dog = new Dog();
        dog.sound();
    }

    @Test
    public void testFrog()
    {
        Frog frog = new Frog();
        frog.movement();
        frog.eat();
    }

    @Test
    public void testCat()
    {
        Cat cat = new Cat();
        cat.sound();
        cat.eat();
    }
}