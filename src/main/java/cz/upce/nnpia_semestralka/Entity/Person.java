package cz.upce.nnpia_semestralka.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String birthPlace;

    @OneToMany(mappedBy = "id",fetch = FetchType.LAZY)
    private Set<FilmHasPerson> filmsWithPerson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Set<FilmHasPerson> getFilmsWithPerson() {
        return filmsWithPerson;
    }

    public void setFilmsWithPerson(Set<FilmHasPerson> filmsWithPerson) {
        this.filmsWithPerson = filmsWithPerson;
    }
}
