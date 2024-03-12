package org.lconnectverse.entity.Records;

public record Posts(String title, String description) {

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
