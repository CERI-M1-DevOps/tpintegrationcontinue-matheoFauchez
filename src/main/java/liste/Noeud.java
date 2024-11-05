package liste;

/**
 * Class to deal with elements of lists
 */
public class Noeud {
    private Object element;
    private Noeud suivant;

    /**
     * Constructor
     * @param e the value
     * @param suivant the next Noeud/element
     */
    public Noeud(int e, Noeud suivant) {
        element = e;
        this.suivant = suivant;
    }

    /**
     * Return an element
     * @return Object
     */
    public Object getElement() {
        return element;
    }

    /**
     * Set the Noeud element
     * @param element the object to insert into the Noeud
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * Return the next Noeud/element
     * @return the next Noeud/element
     */
    public Noeud getSuivant() {
        return suivant;
    }

    /**
     * Set the next Noeud/element
     * @param suivant next Noeud/element
     */
    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    /**
     * Return a readable string for a Noeud/element
     * @return a readable string for a Noeud/element
     */
    public String toString() {
        return "Noeud(" + element + ")";
    }
}
