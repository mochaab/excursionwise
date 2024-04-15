package com.excursionwise.excursionwise;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Excursion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String place;
    private int numberOfParticipants;

    public Excursion(){
        
    }

    public Excursion(String title, String place, int numberOfParticipants){
        this.title = title;
        this.place = place;
        this.numberOfParticipants = numberOfParticipants;
    }

    

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Excursion))
      return false;
      Excursion excursion = (Excursion) o;
    return Objects.equals(this.id, excursion.id) && Objects.equals(this.title, excursion.title)
        && Objects.equals(this.place, excursion.place) 
        && Objects.equals(this.numberOfParticipants, excursion.numberOfParticipants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.title, this.place, this.numberOfParticipants);
  }

  @Override
  public String toString() {
    return "Excursion{" + "id=" + this.id + ", title='" + this.title + '\'' + ", place='" + this.place + '\'' + ", numberOfParticipants='" + this.numberOfParticipants + '\'' + '}';
  }



}
