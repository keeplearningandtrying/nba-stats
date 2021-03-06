package fr.hippo.nbastats.domain;

import org.apache.commons.lang3.StringUtils;

public class Identity {
    public static final int MAX_LENGTH = 11;
    private final String firstName;
    private final String lastName;

    public Identity(String firstName, String lastName) {
        this.firstName = emptyIfNull(firstName);
        this.lastName = emptyIfNull(lastName);
    }

    private String emptyIfNull(String name) {
        if (name == null) {
            return " ";
        }

        return name;
    }

    @Override
    public String toString() {
        return truncateOrFill(firstName.substring(0, 1) + ". " + lastName);
    }

    private String truncateOrFill(String name) {
        if (name.length() > MAX_LENGTH) {
            return name.substring(0, MAX_LENGTH);
        }

        return StringUtils.rightPad(name, MAX_LENGTH);
    }
}
