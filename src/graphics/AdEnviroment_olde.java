/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import environment.Environment;
import images.ResourceTools;

/**
 *
 * @author Slugs
 */
class AdEnviroment_olde extends Environment {

    public AdEnviroment_olde() {
    }
    
    Image logo;
  
    @Override
    public void initializeEnvironment() {
        this.setBackground(Color.BLACK);
       logo =  ResourceTools.loadImageFromResource("resources/Apple Logo.jpg");

    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        graphics.setColor(Color.ORANGE);
        graphics.fillOval(400, 150, 550, 550);

        graphics.setColor(Color.YELLOW);
        graphics.fillOval(445, 200, 450, 450);

        graphics.setColor(Color.CYAN);
        graphics.fillOval(200, 75, 200, 200);
       
        graphics.setColor(Color.GRAY);
        graphics.fillOval(150, 350, 150, 150);

        graphics.setColor(Color.RED);
        graphics.fillOval(30, 200, 70, 70);
        
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(38, 209, 55, 55);
        
        graphics.setColor(Color.MAGENTA);
        graphics.fillOval(20, 20, 12, 12);
        
    }
}
