package com.grudepb.fest.kotlin.api.models;

public class JavaUser {

    private String id;
    private String firstName;
    private String lastName;
    private int age;

    public JavaUser(final String id,
                    final String firstName,
                    final String lastName,
                    final int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final JavaUser javaUser = (JavaUser) o;

        if (age != javaUser.age) return false;
        if (id != null ? !id.equals(javaUser.id) : javaUser.id != null) return false;
        if (firstName != null ? !firstName.equals(javaUser.firstName) : javaUser.firstName != null) return false;
        return lastName != null ? lastName.equals(javaUser.lastName) : javaUser.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "JavaUser{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}