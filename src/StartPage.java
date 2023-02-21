//package StartPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sevva
 */
public class StartPage{

    /**
     * @param args the command line arguments
     */
    public void StartPage() {
        // TODO code application logic here
        JFrame f = new JFrame("START PAGE");
        f.setSize(500,500);
    
        JLabel l1 = new JLabel();
        l1.setText("WELCOME SPİCE GAME");
        l1.setBounds(180, 100, 200, 100);
                
        
        JButton btn = new JButton("START");
        btn.setBounds(200, 200, 100, 50);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
    
    ekran.setResizable(false);
    ekran.setFocusable(false);
    
    ekran.setSize(800,600);
    
    ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Oyun oyun = new Oyun();
    
    oyun.requestFocus();
    
    oyun.addKeyListener(oyun);
    
    oyun.setFocusable(true);
    oyun.setFocusTraversalKeysEnabled(false);
    
    
    ekran.add(oyun);
   
    ekran.setVisible(true);
                        
            }
        } );
        
        f.add(l1);
        f.add(btn);
        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
                
    
        
        
        
    }

 
    
}
