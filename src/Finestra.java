import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Finestra extends JFrame{
    
    JLabel etichetta1 = new JLabel("   ---  Inserisci il Testo nel JTextField  ---   ");
    JLabel etichetta2 = new JLabel("  ↓ JTextField 1 ↓  ");
    JLabel etichetta3 = new JLabel("  ↓ JTextField 2 ↓  ");
    
    JTextField txt1 = new JTextField("",25);
    JTextField txt2 = new JTextField("",25);   

    JButton pulsante1 = new JButton("Saluta!");

    JPanel pannello = new JPanel();

    JTextArea areaDiTesto = new JTextArea("",5,25);

    public Finestra(){
        super("Esercizio JSwing 1 Nacu");

        setLayout(new BorderLayout());

        add(pannello, BorderLayout.PAGE_START);
        pannello.add(etichetta1);
        pannello.add(etichetta2);
        pannello.add(txt1);
        pannello.add(etichetta3);
        pannello.add(txt2);

        setContentPane(pannello);

        add(areaDiTesto, BorderLayout.CENTER);
        add(pulsante1, BorderLayout.PAGE_END);
        
        pulsante1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String testoTextField1 = txt1.getText();
                if(!testoTextField1.equals("")){
                    areaDiTesto.append(testoTextField1 + "\n");
                    txt1.setText("");
                }
                
                String testoTextField2 = txt2.getText();
                if(!testoTextField2.equals("")){
                    areaDiTesto.append(testoTextField2 + "\n");
                    txt2.setText("");
                }
            }
        });
        
        setTitle("Es JSwing-1 Nacu");
        setSize(350, 275);
        setResizable(true);
        setAlwaysOnTop(true);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
