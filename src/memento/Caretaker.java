package memento;

import java.util.ArrayList;

class Caretaker {

    /**
     * Where all mementos are saved
     **/
    ArrayList<Memento> savedArticles = new ArrayList<>();

    /**
     * Adds memento to the ArrayList
     * @param m 
     */
    public void addMemento(Memento m) {
        savedArticles.add(m);
    }

    /**
     * Gets the memento requested from the ArrayList
     * @param index
     * @return 
     */
    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }
}
