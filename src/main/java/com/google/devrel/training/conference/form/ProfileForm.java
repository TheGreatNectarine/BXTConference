package com.google.devrel.training.conference.form;

public class ProfileForm {
    private String       displayName;
    private TeeShirtSize teeShirtSize;

    private ProfileForm() {
    }

    /**
     * Constructor for ProfileForm, solely for unit test.
     *
     * @param displayName A String for displaying the user on this system.
     */
    public ProfileForm(String displayName, TeeShirtSize teeShirtSize) {
        this.displayName = displayName;
        this.teeShirtSize = teeShirtSize;
    }

    public String getDisplayName() {
        return displayName;
    }

    public TeeShirtSize getTeeShirtSize() {
        return teeShirtSize;
    }

    public static enum TeeShirtSize {
        NOT_SPECIFIED,
        XS,
        S,
        M,
        L,
        XL,
        XXL,
        XXXL
    }
}
