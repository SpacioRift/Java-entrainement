import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CercleSwing extends JFrame {
	private JTextField saisieRayon;
	public CercleSwing() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculer le périmètre d'un cercle");
        getContentPane().setLayout(null);
        
        JLabel labelRayon = new JLabel("Rayon : ");
        labelRayon.setHorizontalAlignment(SwingConstants.RIGHT);
        labelRayon.setBounds(22, 37, 50, 20);
        getContentPane().add(labelRayon);
        
        JLabel labelPerimetre = new JLabel("périmètre :");
        labelPerimetre.setHorizontalAlignment(SwingConstants.CENTER);
        labelPerimetre.setBounds(231, 37, 80, 20);
        getContentPane().add(labelPerimetre);
        
        JLabel labelResultat = new JLabel("0");
        labelResultat.setHorizontalAlignment(SwingConstants.RIGHT);
        labelResultat.setBounds(301, 37, 123, 20);
        getContentPane().add(labelResultat);
        
        JButton btnCalculer = new JButton("Calculer");
        btnCalculer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		double rayon = Double.parseDouble(saisieRayon.getText());
        		double perimetre = 2 * Math.PI * rayon;
        		labelResultat.setText(Double.toString(perimetre));
        	}
        });
        btnCalculer.setBounds(184, 91, 100, 20);
        getContentPane().add(btnCalculer);
        
        saisieRayon = new JTextField();
        saisieRayon.setHorizontalAlignment(SwingConstants.RIGHT);
        saisieRayon.setText("0");
        saisieRayon.setBounds(82, 37, 86, 20);
        getContentPane().add(saisieRayon);
        saisieRayon.setColumns(10);
	}

	public static void main(String[] args) {
		Runnable traitement = new Runnable() {
            public void run() {
                CercleSwing fenetre = new CercleSwing();
                fenetre.setSize(450, 200);
                fenetre.setVisible(true);
            };
        };
        java.awt.EventQueue.invokeLater(traitement);
	}

}