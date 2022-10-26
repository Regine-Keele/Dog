
/**
 * Write a description of class DogSwing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DogSwing extends JFrame
{
    JButton ok_Button = new JButton();
    JButton close_Button = new JButton();
    
    JLabel breed_Label = new JLabel();
    JLabel tagNumber_Label = new JLabel();
    JLabel color_Label = new JLabel();
    JLabel ok_Label = new JLabel();
    JLabel close_Label = new JLabel();
    
    JTextField breed_TF = new JTextField();
    JTextField tagNumber_TF = new JTextField();
    JTextField color_TF = new JTextField();
    
    public DogSwing(){
        setTitle("DOG INFO");
        setSize(300,200);
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gC = new GridBagConstraints();
        
        breed_Label.setText("Breed: ");
        gC.gridx = 0;
        gC.gridy = 0;
        getContentPane().add(breed_Label,gC);
        
        tagNumber_Label.setText("Tag Number: ");
        gC.gridx = 0;
        gC.gridy = 1;
        getContentPane().add(tagNumber_Label,gC);
        
        color_Label.setText("Color: ");
        gC.gridx = 0;
        gC.gridy = 2;
        getContentPane().add(color_Label,gC);
        
        ok_Button.setText("OK");
        gC.gridx = 0;
        gC.gridy = 3;
        getContentPane().add(ok_Button,gC);
        
        breed_TF.setText("");
        breed_TF.setColumns(15);
        gC.gridx = 1;
        gC.gridy = 0;
        getContentPane().add(breed_TF,gC);
        
        tagNumber_TF.setText("");
        tagNumber_TF.setColumns(15);
        gC.gridx = 1;
        gC.gridy = 1;
        getContentPane().add(tagNumber_TF,gC);
        
        color_TF.setText("");
        color_TF.setColumns(15);
        gC.gridx = 1;
        gC.gridy = 2;
        getContentPane().add(color_TF,gC);
        
        close_Button.setText("Close");
        gC.gridx = 1;
        gC.gridy = 3;
        getContentPane().add(close_Button,gC);
        pack();
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                exitForm(e);
            }
        });
        
        ok_Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                okButtonActionPerformed(e);
            }
        });
        
        close_Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                closeButtonActionPerformed(e);
            }
        });

    }
    public void exitForm(WindowEvent e){
        System.exit(0);
    }
    
    public void okButtonActionPerformed(ActionEvent e){
        JFrame f = new JFrame();
        String Breed = breed_TF.getText();
        String TagNumber = tagNumber_TF.getText();
        String Color = color_TF.getText();
        JOptionPane.showMessageDialog(f,"Breed: "+Breed+"\nTag Number: " +TagNumber+ "\nColor: "+Color);
    }
    
    public void closeButtonActionPerformed(ActionEvent e){
        System.exit(0);
    }
    public static void main(String[] args){
        new DogSwing().show();
    }
}
