package ro.java.ctrln;

import java.util.Objects;

public class Person {

    private String cnp;

    public Person(){}

    public Person(String cnp) {
        this.cnp = cnp;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cnp='" + cnp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return cnp.equals(person.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize in clasa Person");
    }
}
