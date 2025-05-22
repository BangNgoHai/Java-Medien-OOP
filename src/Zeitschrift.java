/**
 * Represents a magazine which is a type of media item.
 */
public class Zeitschrift extends Medium {
    private int nummer; // Number of the magazine

    /**
     * Constructor to initialize the magazine with its title, year of publication, and number.
     * 
     * @param titel             The title of the magazine.
     * @param erscheinungsjahr  The year of publication of the magazine.
     * @param nummer            The number of the magazine.
     */
    public Zeitschrift(String titel, int erscheinungsjahr, int nummer) {
        super(titel, erscheinungsjahr);
        setNummer(nummer);
    }

    /**
     * Getter method for retrieving the number of the magazine.
     * 
     * @return The number of the magazine.
     */
    public int getNummer() {
        return nummer;
    }

    /**
     * Setter method for setting the number of the magazine.
     * 
     * @param nummer The number to be set for the magazine.
     * @throws IllegalArgumentException if the number is less than 1.
     */
    public void setNummer(int nummer) {
        if (nummer < 1) {
            throw new IllegalArgumentException("Nummer muss größer oder gleich 1 sein");
        }
        this.nummer = nummer;
    }

    /**
     * Overrides the method to calculate the loan period of the magazine.
     * 
     * @return The loan period of the magazine (7 days).
     */
    @Override
    public int getLeihFrist() {
        return 7; // Tạp chí có thời hạn mượn 7 ngày
    }

    /**
     * Overrides the method to provide a string representation of the magazine.
     * 
     * @return A string representation of the magazine.
     */
    @Override
    public String toString() {
        return getTitel() + " (" + getNummer() + "/" + getErscheinungsjahr() + ")";
    }
}
