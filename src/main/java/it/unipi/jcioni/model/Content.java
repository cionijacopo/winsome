package it.unipi.jcioni.model;

public class Content {
    private final User creator;

    public Content(User creator) {
        this.creator = creator;
    }

    public User getCreator() {
        return creator;
    }

}