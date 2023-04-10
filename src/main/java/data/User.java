package data;

public enum User {
    DEFAULT_USER("+$$$$$$$$$$$$4","%%%%%%%%%%%"),
    INCORRECT_USER("+380976003129","fksfmsfksfmskmf222134");

    private String LOGIN;
    private String PASSWORD;

    User(String LOGIN, String PASSWORD) {
        this.LOGIN = LOGIN;
        this.PASSWORD = PASSWORD;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}

