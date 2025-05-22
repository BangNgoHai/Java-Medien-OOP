/**
 * Abstract class representing a media item.
 */
public abstract class Medium {
    private String titel; // Title of the media item
    private int erscheinungsjahr; // Year of publication

    /**
     * Constructor to initialize the media item with its title and year of publication.
     * 
     * @param titel             The title of the media item.
     * @param erscheinungsjahr  The year of publication of the media item.
     */
    public Medium(String titel, int erscheinungsjahr) {
        setTitel(titel);
        setErscheinungsjahr(erscheinungsjahr);
    }

    /**
     * Getter method for retrieving the title of the media item.
     * 
     * @return The title of the media item.
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Setter method for setting the title of the media item.
     * 
     * @param titel The title to be set for the media item.
     */
    public void setTitel(String titel) {
        if (titel == null || titel.trim().isEmpty()) {
            throw new IllegalArgumentException("Titel darf nicht null oder leer sein");
        }
        this.titel = titel;
    }

    /**
     * Getter method for retrieving the year of publication of the media item.
     * 
     * @return The year of publication of the media item.
     */
    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    /**
     * Setter method for setting the year of publication of the media item.
     * 
     * @param erscheinungsjahr The year of publication to be set for the media item.
     */
    public void setErscheinungsjahr(int erscheinungsjahr) {
        if (erscheinungsjahr < 0) {
            throw new IllegalArgumentException("Erscheinungsjahr muss größer oder gleich 0 sein");
        }
        this.erscheinungsjahr = erscheinungsjahr;
    }

    /**
     * Abstract method to calculate the loan period of the media item.
     * 
     * @return The loan period of the media item.
     */
    public abstract int getLeihFrist();

    /**
     * Returns a string representation of the media item.
     * 
     * @return A string representation of the media item.
     */
    @Override
    public String toString() {
        return titel + " (" + erscheinungsjahr + ")";
    }
}
