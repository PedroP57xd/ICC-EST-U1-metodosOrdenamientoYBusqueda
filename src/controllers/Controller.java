package controllers;

import models.Person;
import views.View;

public class Controller {
    private View view;
    private Person[] persons;
    private SortingMethods sortingMethods;
    private SerchMethods serchMethods;

    public void start() {

    }

    public void inputPersons() {

    }

    public void addpersons() {

    }

    public void sortPersons() {

    }

    public void serchPersons() {

    }

    public Controller(View view, Person[] persons, SortingMethods sortingMethods, SerchMethods serchMethods) {
        this.view = view;
        this.persons = persons;
        this.sortingMethods = sortingMethods;
        this.serchMethods = serchMethods;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public SortingMethods getSortingMethods() {
        return sortingMethods;
    }

    public void setSortingMethods(SortingMethods sortingMethods) {
        this.sortingMethods = sortingMethods;
    }

    public SerchMethods getSerchMethods() {
        return serchMethods;
    }

    public void setSerchMethods(SerchMethods serchMethods) {
        this.serchMethods = serchMethods;
    }

}
