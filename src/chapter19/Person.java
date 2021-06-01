package chapter19;

import java.util.Objects;

public class Person {
    public enum Gender{MALE,FEMALE,OTHER}
    String firstName;
    String lastName;
    Gender gender;
    int age;
    float weight;
    float length;

    public Person(String firstName, String lastName, Gender gender, int age, float weight, float length) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Person[" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", weight=" + weight +
                ", length=" + length +
                ']';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age, weight, length);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person other = (Person)obj;
            return this.toString().equals(other.toString());
        }
        return false;
    }
}
