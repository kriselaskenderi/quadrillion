package gazillion;

import quadrillion.QGame;
import utils.Message;
import utils.Observer;

import javax.swing.*;

/**
 * QUtilityPanel
 * TODO: OBSERVER PATTERN FOR TIMER UPDATE.
 * TODO: TIMER SHOULD IMPLEMENT OBSERVABLE AND THIS SHOULD IMPLEMENT OBSERVER
 * @author Unsal Ozturk
 * @version 20190328
 */
public class QUtilityPanel extends QPanel implements Observer {
    //private JButton health;
    private JButton time;
    //private JButton hint;
    private JLabel timeLeft;
    private QGame game;
    public QUtilityPanel(QPanel panel, QFrame frame, QGame game) {
        super(panel,frame);
        //health = new JButton("Health!");
        time = new JButton("Time!");
        //hint = new JButton("Hint!");
        timeLeft = new JLabel("Time Left: " + game.getTimer().getTimeRemaining() / 1000.0);
        this.game = game;

        //add(health);
        add(time);
        //add(hint);
        add(timeLeft);
    }

    @Override
    public void update(Message msg) {
        timeLeft.setText("Time Left: " + game.getTimer().getTimeRemaining() / 1000.0);
    }
}
