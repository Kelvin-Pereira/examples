package stream.objets;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;

    private Integer age;

    private Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    private List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Kelvin", 25));
        persons.add(new Person("Fabio", 12));
        persons.add(new Person("Gabriel", 18));
        persons.add(new Person("Leandro", 45));
        persons.add(new Person("Alarik", 27));
        persons.add(new Person("Sofia", 10));
        return persons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + name + '\'' +
                ", Idade=" + age +
                '}';
    }

    public void main(){
        getPersons().stream().filter(Person::isMaiorDe18).forEach(System.out::println);
    }

    public boolean isMaiorDe18() {
        return getAge() >= 18;
    }

}
