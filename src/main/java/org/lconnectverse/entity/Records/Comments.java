package org.lconnectverse.entity.Records;

public record Comments(String description) {
    public String getDescription() {
        return description;
    }
}
