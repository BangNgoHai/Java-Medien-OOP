/**
 * Represents a CD in the library.
 */
public class CD extends Medium {
    private String kuenstler; // Artist(s) of the CD
    private int gesamtspielzeit; // Total playtime of the CD (in minutes)

    // Constructor
    /**
     * Constructs a new CD object with the given parameters.
     * 
     * @param titel             The title of the CD.
     * @param erscheinungsjahr  The publication year of the CD.
     * @param kuenstler         The artist(s) of the CD.
     * @param gesamtspielzeit   The total playtime of the CD (in minutes).
     */
    public CD(String titel, int erscheinungsjahr, String kuenstler, int gesamtspielzeit) {
        super(titel, erscheinungsjahr);
        setKuenstler(kuenstler);
        setGesamtspielzeit(gesamtspielzeit);
    }

    // Getter và Setter
    /**
     * Retrieves the artist(s) of the CD.
     * 
     * @return The artist(s) of the CD.
     */
    public String getKuenstler() {
        return kuenstler;
    }

    /**
     * Sets the artist(s) of the CD.
     * 
     * @param kuenstler The artist(s) of the CD to set.
     * @throws IllegalArgumentException if the given artist(s) is null or empty.
     */
    public void setKuenstler(String kuenstler) {
        if (kuenstler == null || kuenstler.trim().isEmpty()) {
            throw new IllegalArgumentException("Kuenstler darf nicht null oder leer sein");
        }
        this.kuenstler = kuenstler;
    }

    /**
     * Retrieves the total playtime of the CD.
     * 
     * @return The total playtime of the CD (in minutes).
     */
    public int getGesamtspielzeit() {
        return gesamtspielzeit;
    }

    /**
     * Sets the total playtime of the CD.
     * 
     * @param gesamtspielzeit The total playtime of the CD to set (in minutes).
     * @throws IllegalArgumentException if the given playtime is less than 1.
     */
    public void setGesamtspielzeit(int gesamtspielzeit) {
        if (gesamtspielzeit < 1) {
            throw new IllegalArgumentException("Gesamtspielzeit muss größer oder gleich 1 sein");
        }
        this.gesamtspielzeit = gesamtspielzeit;
    }

    // Override phương thức tính toán thời hạn mượn
    /**
     * Calculates and retrieves the loan period for the CD.
     * 
     * @return The loan period for the CD (in days).
     */
    @Override
    public int getLeihFrist() {
        return 14; // CD có thời hạn mượn 14 ngày
    }

    // Override phương thức toString
    /**
     * Returns a string representation of the CD.
     * 
     * @return A string representation of the CD.
     */
    @Override
    public String toString() {
        return getKuenstler() + ": " + super.toString() + " " + getGesamtspielzeit() + " Minuten";
    }
}
