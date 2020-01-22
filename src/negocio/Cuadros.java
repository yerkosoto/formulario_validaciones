package negocio;

import datos.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import negocio.LecturaArchivo;

public class Cuadros extends JFrame implements ActionListener{

    JLabel lblRut, lblPass, lblIngresaOk, lblIngresaError;
    JButton btnIngresar;
    JTextField txtRut;
    JPasswordField txtPassword;

    public JLabel getLblRut() {
        return lblRut;
    }

    public void setLblRut(JLabel lblRut) {
        this.lblRut = lblRut;
    }

    public JLabel getLblPass() {
        return lblPass;
    }

    public void setLblPass(JLabel lblPass) {
        this.lblPass = lblPass;
    }
    
    public Cuadros() {    
        setLayout(null);
        
        lblRut = new JLabel("RUT");
        lblRut.setBounds(10, 30, 80, 30);
        add(lblRut);
        
        txtRut = new JTextField();
        txtRut.setBounds(100,30,200,30);
        add(txtRut);
        
        lblPass = new JLabel("Contraseña");
        lblPass.setBounds(10, 70, 80, 30);
        add(lblPass);
        
        txtPassword = new JPasswordField();
        txtPassword.setBounds(100, 70, 200, 30);        
        add(txtPassword);
        
        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(150, 120, 100, 30);
        add(btnIngresar);              
        btnIngresar.addActionListener(this);    
        
        lblIngresaOk = new JLabel("");
        lblIngresaOk.setBounds(100,100,100,100);
        add(lblIngresaOk);
        
        lblIngresaError = new JLabel("");
        lblIngresaError.setBounds(100,100,100,100);
        add(lblIngresaError);
        				
        setTitle("Piedad");
    }   
       
    public void actionPerformed(ActionEvent evento){        
        if (Integer.parseInt(txtPassword.getText()) > 5){
                JOptionPane.showMessageDialog(null, "Bienvenido");
            }
        else {
            JOptionPane.showMessageDialog(null, "Contraseña mala ");
        }
    }
    
    public static void cuadrito(){
        Cuadros frmMarco = new Cuadros();
        frmMarco.setBounds(0, 0, 400, 200);
        frmMarco.setVisible(true);
        frmMarco.setLocationRelativeTo(null);
        frmMarco.setResizable(true);
        
        frmMarco.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evento){
                System.exit(0);                
            }            
        });        
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pack();
    }
}