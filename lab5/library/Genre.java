package lab5.library;

//to represent fixed set of constant values
public enum Genre {
    FICTION, SCIENCE, BIOGRAPHY, HISTORY, FANTASY, TECHNOLOGY;

    //convert user genre input to UPPERCASE
    public static Genre fromString(String s) {
        try {
            return Genre.valueOf(s.trim().toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }
}
