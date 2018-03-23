package pe.edu.tecsup.lab06.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.edu.tecsup.lab06.models.Person;

/**
 * Created by Alumno on 23/03/2018.
 */

public class PersonRepository {

    private static List<Person> people = new ArrayList<>();

    static {
        people.add(new Person(100, "liset amaro", "liset@gmail.com", "jalazar"));
        people.add(new Person(100, "liset amaro", "liset@gmail.com", "jalazar"));
        people.add(new Person(100, "liset amaro", "liset@gmail.com", "jalazar"));

    }

}
