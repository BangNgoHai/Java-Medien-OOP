/**
 * Represents a book in the library.
 */
public class Buch extends Medium {
    private String verlag; // Publisher of the book
    private String autor; // Author(s) of the book

    // Constructor
    /**
     * Constructs a new Buch object with the given parameters.
     * 
     * @param titel             The title of the book.
     * @param erscheinungsjahr  The publication year of the book.
     * @param verlag            The publisher of the book.
     * @param autor             The author(s) of the book.
     */
    public Buch(String titel, int erscheinungsjahr, String verlag, String autor) {
        super(titel, erscheinungsjahr);
        setVerlag(verlag);
        setAutor(autor);
    }

    // Getter và Setter
    /**
     * Retrieves the publisher of the book.
     * 
     * @return The publisher of the book.
     */
    public String getVerlag() {
        return verlag;
    }

    /**
     * Sets the publisher of the book.
     * 
     * @param verlag The publisher of the book to set.
     * @throws IllegalArgumentException if the given publisher is null or empty.
     */
    public void setVerlag(String verlag) {
        if (verlag == null || verlag.trim().isEmpty()) {
            throw new IllegalArgumentException("Verlag darf nicht null oder leer sein");
        }
        this.verlag = verlag;
    }

    /**
     * Retrieves the author(s) of the book.
     * 
     * @return The author(s) of the book.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Sets the author(s) of the book.
     * 
     * @param autor The author(s) of the book to set.
     * @throws IllegalArgumentException if the given author(s) is null or empty.
     */
    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Autor darf nicht null oder leer sein");
        }
        this.autor = autor;
    }

    // Override phương thức tính toán thời hạn mượn
    /**
     * Calculates and retrieves the loan period for the book.
     * 
     * @return The loan period for the book (in days).
     */
    @Override
    public int getLeihFrist() {
        return 28; // Sách có thời hạn mượn 28 ngày
    }

    // Override phương thức toString
    /**
     * Returns a string representation of the book.
     * 
     * @return A string representation of the book.
     */
    @Override
    public String toString() {
        return getAutor() + ": " + getTitel() + " (" + getErscheinungsjahr() + ") " + getVerlag();
    }
}
