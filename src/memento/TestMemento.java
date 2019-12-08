package memento;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class TestMemento extends JFrame {

    public static void main(String[] args) {
        new TestMemento();
    }

    private JButton saveBut, undoBut, redoBut;
    // JTextArea(rows, columns)
    private JTextArea theArticle = new JTextArea(18, 30);
    /**
     * A caretaker that contains the ArrayList with all the articles in it.
     * It can add and retrieve articles from the ArrayList
     */
    private Caretaker caretaker = new Caretaker();

    // The originator sets the value for the article,
    // creates a new memento with a new article, and 
    // gets the article stored in the current memento
    private Originator originator = new Originator();

    private int saveFiles = 0, currentArticle = 0;

    public TestMemento() {
        this.setSize(375, 390);
        this.setTitle("Memento Design Pattern");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Article"));
        panel.add(theArticle);

        // Add the buttons & ButtonListeners to the panel
        saveBut = new JButton("Save");
        saveBut.addActionListener(this::guardar);

        undoBut = new JButton("Undo");
        undoBut.setEnabled(false);
        undoBut.addActionListener(this::deshacer);

        redoBut = new JButton("Redo");
        redoBut.setEnabled(false);
        redoBut.addActionListener(this::rehacer);

        panel.add(saveBut);
        panel.add(undoBut);
        panel.add(redoBut);

        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        originator.set("");
        caretaker.addMemento(originator.storeInMemento());
    }
    
    public void guardar(ActionEvent e) {
        String textInTextArea = theArticle.getText();

        // Set the value for the current memento
        originator.set(textInTextArea);

        // Add new article to the ArrayList
        caretaker.addMemento(originator.storeInMemento());

        // saveFiles monitors how many articles are saved
        // currentArticle monitors the current article displayed
        saveFiles++;
        currentArticle++;

        System.out.println("Save Files " + saveFiles);

        // Make undo clickable
        undoBut.setEnabled(true);
    }

    public void deshacer(ActionEvent e) {
        if (currentArticle >= 1) {
            // Decrement to the current article displayed
            currentArticle--;
        
            // Get the older article saved and display it in JTextArea
            String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
            theArticle.setText(textBoxString);

            // Make Redo clickable
            redoBut.setEnabled(true);
            if (currentArticle == 0)
                undoBut.setEnabled(false);
        }
    }
    
    public void rehacer(ActionEvent e) {
        if (saveFiles > currentArticle) {
            // Increment to the current article displayed
            currentArticle++;

            // Get the newer article saved and display it in JTextArea
            String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
            theArticle.setText(textBoxString);

            // Make undo clickable
            undoBut.setEnabled(true);
            if (saveFiles == currentArticle) 
                redoBut.setEnabled(false);
        } 
    }
}
