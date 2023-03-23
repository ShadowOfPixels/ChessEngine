package gui.inGameScreen;

import content.Screen;
import content.Button;
import java.awt.*;
import java.util.ResourceBundle;

public class GameStateGui extends Screen {

    int BUTTONMARGINHOR=50;
    Font font = new Font("Comic Sans MS", Font.BOLD, 40);
    Button playButton;
    Button loadButton;
    Button saveButton;

    public GameStateGui(ResourceBundle resourceBundle){

        playButton = new Button(resourceBundle.getString("start"));
        loadButton = new Button(resourceBundle.getString("load"));
        saveButton = new Button(resourceBundle.getString("save"));

        playButton.setFont(font);
        playButton.setToolTipText(resourceBundle.getString("startToolTip"));
        loadButton.setFont(font);
        loadButton.setToolTipText(resourceBundle.getString("loadToolTip"));
        saveButton.setFont(font);
        saveButton.setToolTipText(resourceBundle.getString("saveToolTip"));


        int center=300;
        int height=350;
        int location=260;

        playButton.setBounds(location, center, getButtonWidth(playButton), height);
        location += playButton.getWidth()+25;
        loadButton.setBounds(location, center,  getButtonWidth(loadButton), height);
        location += loadButton.getWidth()+25;
        saveButton.setBounds(location, center,  getButtonWidth(saveButton), height);
        //location += saveButton.getWidth()+25;

        add(playButton);
        add(loadButton);
        add(saveButton);
        repaint();



    }

    /**
     *
     * @param button  content.button
     * @return text width + 2x margin
     * the width the text contained in the button
     */
    private int getButtonWidth(Button button){
        FontMetrics metrics = getFontMetrics( font );
        return metrics.stringWidth( button.getText()) + (BUTTONMARGINHOR*2);
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.decode("#a1b0a0"));
        g.fillRect(getX(), getY(), getWidth(), getHeight());


    }




}