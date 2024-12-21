package LabWork02.Task02;

public enum Color {
    BLUE("синий", 123),
    GREEN("зеленый", 124),
    WHITE("белый", 125),
    BLACK("черный", 126),
    PINK("розовый", 127),
    RED("красный", 128),
    YELLOW("желтый", 129),
    LIGHT_BLUE("светлосиний", 130);

    private final String description;
    private final int code;

    Color(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}
