package gazillion;

import javax.swing.*;
import java.awt.*;

/**
 * QPlayerInfoPanel
 *
 * @author Unsal Ozturk
 * @version 20190328
 */
public class QPlayerInfoPanel extends QPanel {
    private QPlayer player;
    private JLabel nameLabel;
    private JLabel coinLabel;
    private JLabel healthLabel;
    private JLabel hintLabel;
    public QPlayerInfoPanel(QPanel parent, QFrame frame, QPlayer player) {
        super(parent, frame);
        this.player = player;

        nameLabel = new JLabel("Name: " + player.getName());
        coinLabel = new JLabel("Coins: " + player.getNoCoins());
        healthLabel = new JLabel("Health " + player.getNoHealth());
        hintLabel = new JLabel("Hints: " + player.getNoHints());

        this.setLayout(new FlowLayout());
        this.add(nameLabel);
        this.add(coinLabel);
        this.add(healthLabel);
        this.add(hintLabel);
    }

    public void update() {
        nameLabel.setText("Name: " + player.getName());
        coinLabel.setText("Coins: " + player.getNoCoins());
        healthLabel.setText("Health " + player.getNoHealth());
        hintLabel.setText("Hints: " + player.getNoHints());
    }
}
