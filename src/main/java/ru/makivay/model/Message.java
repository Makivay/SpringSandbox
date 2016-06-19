package ru.makivay.model;

/**
 * Created by makivay on 19.06.16.
 */
public class Message {
    private final Long id;
    private final String data;

    public Message(Long id, String data) {
        this.id = id;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public String getData() {
        return data;
    }
}
