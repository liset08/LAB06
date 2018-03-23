package pe.edu.tecsup.lab06.models;

/**
 * Created by Alumno on 23/03/2018.
 */

public class Person {

    public Person(Integer id, String fullname, String email, String picture) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }

    private Integer id;
    private String fullname;

    private String email;
    private String picture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


}

