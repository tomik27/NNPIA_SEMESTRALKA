package cz.upce.nnpia_semestralka.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Film {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String name;
    //neni zaneseno v modelu
    private String path_to_image;
    private Genre genre;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;
   @OneToMany(mappedBy = "id",fetch = FetchType.LAZY)
    private Set<FilmHasPerson> personsInFilm;

    @OneToMany(mappedBy = "id",fetch = FetchType.LAZY)
    private Set<UserHasFilm> ratingByUsers;

 /*   @ManyToOne
    private FilmLibrary filmLibrary;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath_to_image() {
        return path_to_image;
    }

    public void setPath_to_image(String path_to_image) {
        this.path_to_image = path_to_image;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Set<FilmHasPerson> getPersonsInFilm() {
        return personsInFilm;
    }

    public void setPersonsInFilm(Set<FilmHasPerson> personsInFilm) {
        this.personsInFilm = personsInFilm;
    }

    public Set<UserHasFilm> getRatingByUsers() {
        return ratingByUsers;
    }

    public void setRatingByUsers(Set<UserHasFilm> ratingByUsers) {
        this.ratingByUsers = ratingByUsers;
    }
}
