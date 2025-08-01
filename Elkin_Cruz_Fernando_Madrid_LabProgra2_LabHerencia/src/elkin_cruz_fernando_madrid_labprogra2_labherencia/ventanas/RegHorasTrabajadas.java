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
        
        titulo.setBounds(30, -50, 500, 300);
        titulo.setFont(new Font("Kefa", Font.BOLD, 38));
        titulo.setForeground(Color.black);
        
        add(titulo);
        
    }
    
    private final JLabel titulo = new JLabel("Registrar Horas Trabajadas");
    
    public static void main(String[] args) {
        new RegHorasTrabajadas().setVisible(true);
    }
    
}
