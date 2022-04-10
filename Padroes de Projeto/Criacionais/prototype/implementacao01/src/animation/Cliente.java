package animation;

import animation.model.Person;
import animation.model.PersonSamples;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private static List<Person> frames = new ArrayList<Person>();

    public static void animated() throws InterruptedException {

        System.out.println("******************************************");
        System.out.println("* ");
        System.out.println("* Adjust your screen's height");
        System.out.println("* ");
        System.out.println("******************************************");
        Thread.sleep(3000);

        for (Person frame : frames) {
            frame.draw();
            Thread.sleep(500);
        }

        System.out.println("******************************************");
        System.out.println("* ");
        System.out.println("* END");
        System.out.println("* ");
        System.out.println("******************************************");


    }

    public static Person addLeft(Person p) throws CloneNotSupportedException {

        Person person = (Person) p.clone();
        person.left();
        frames.add(person);
        return person;

    }

    public static Person addRight(Person p) throws CloneNotSupportedException {

        Person person = (Person) p.clone();
        person.right();
        frames.add(person);
        return person;

    }

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

        PersonSamples samples = new PersonSamples();

        Person person = samples.get("gostosa2");
        frames.add(person);
        person =addLeft(person);
        person =addLeft(person);
        person =addLeft(person);
        person =addRight(person);
        person =addRight(person);
        person =addRight(person);
        person =addRight(person);
        person =addRight(person);
        person =addRight(person);
        person =addRight(person);
        person =addLeft(person);
        person =addLeft(person);
        person =addLeft(person);
        animated();


    }


}
