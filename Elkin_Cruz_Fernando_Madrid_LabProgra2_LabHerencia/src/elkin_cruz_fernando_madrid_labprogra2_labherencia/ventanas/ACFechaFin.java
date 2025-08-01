package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class ACFechaFin extends JFrame{
    
    public ACFechaFin(){
        initVentana();
        initComponentes();
    }
    
    private void initVentana(){
        
        setSize(700, 600);
        setTitle("HERENCIA");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
    }
    
    private void initComponentes(){
        
        titulo.setBounds(30, -50, 500, 300);
        titulo.setFont(new Font("Kefa", Font.BOLD, 28));
        titulo.setForeground(Color.black);
        codigotext.setBounds(30, 90, 200, 30);
        txtCodigo.setBounds(250, 90, 200, 30);
        nuevafechatext.setBounds(250, 140, 200, 30);
        textfecha.setBounds(250,140,200,30);
        
        
        
        add(titulo);
        add(codigotext);
        add(txtCodigo);
        add(nuevafechatext);
        add(textfecha);
        
    }
    
    private final JLabel titulo = new JLabel("Actualizar Fecha Fin de Contrato");
    private final JLabel codigotext=new JLabel("Ingrese codigo");
    private final JLabel nuevafechatext=new JLabel("Ingrese nueva fecha");
    private final JTextField txtCodigo = new JTextField();
    private final JTextField textfecha=new JTextField();
    
    public static void main(String[] args) {
        new ACFechaFin().setVisible(true);
    }
    
}
