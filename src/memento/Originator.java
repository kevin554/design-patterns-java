package memento;

public class Originator {

    private String article;

    /**
     * Sets the value for the article
     * @param newArticle 
     */
    public void set(String newArticle) {
        System.out.println("From Originator: Current Version of Article\n" 
                + newArticle + "\n");
        this.article = newArticle;
    }

    /**
     * Creates a new Memento with a new article
     * @return 
     */
    public Memento storeInMemento() {
        System.out.println("From Originator: Saving to Memento");
        return new Memento(article);
    }

    /**
     * Gets the article currently stored in memento
     * @param memento
     * @return 
     */
    public String restoreFromMemento(Memento memento) {
        article = memento.getSavedArticle();
        System.out.println("From Originator: Previous Article Saved in Memento\n"
                + article + "\n");

        return article;
    }
}
