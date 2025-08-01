package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class RegHorasTrabajadas extends JFrame{
    
    public RegHorasTrabajadas(){
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
        labelcodigo.setBounds(20, 80, 500, 150 );
        titulo.setBounds(30, -50, 500, 300);
        titulo.setFont(new Font("Kefa", Font.BOLD, 32));
        titulo.setForeground(Color.black);
        
        
        add(titulo);
        add(labelcodigo);
    }
    
    private final JLabel titulo = new JLabel("Registrar Horas Trabajadas");
    private final JLabel labelcodigo=new JLabel("Ingrese codigo del empleado: ");
    private final JLabel labelhoras=new JLabel("Ingrese horas trabajadas: ");
    private final JTextField txtCodigo = new JTextField();
    
    public static void main(String[] args) {
        new RegHorasTrabajadas().setVisible(true);
    }
    
}
