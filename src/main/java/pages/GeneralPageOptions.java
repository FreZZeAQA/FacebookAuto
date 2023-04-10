package pages;

public enum GeneralPageOptions {
    HOME("Home"),
    FRIENDS("Friends"),
    GROUPS("Groups"),
    GAMING("Gaming");

    private String ariaLabelValue;

    GeneralPageOptions(String ariaLabelValue) {
        this.ariaLabelValue = ariaLabelValue;
    }

    public String getAriaLabelValue() {
        return ariaLabelValue;
    }
}
