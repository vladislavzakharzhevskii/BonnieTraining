package hash;

import java.math.BigDecimal;
import java.util.Objects;

public class Human {

    private Integer age;
    private String name;
    private String surname;
    private BigDecimal salary;

    public Human(Integer age, String name, String surname, BigDecimal salary) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(age, human.age) &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(salary, human.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname, salary);
    }
}
