package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class RegistrarEmpleado extends JFrame{
    
    public RegistrarEmpleado(){
        initVentana();
        initComponentes();
    }
    
    private void initVentana(){
        
        setSize(800, 600);
        setTitle("HERENCIA");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
    }
    
    private void initComponentes(){
        
        titulo.setBounds(30, -50, 400, 300);
        titulo.setFont(new Font("Kefa", Font.BOLD, 42));
        titulo.setForeground(Color.black);
        
        tipoLabel.setBounds(35, 20, 400, 300);
        tipoLabel.setFont(new Font("Kefa", Font.BOLD, 20));
        tipoLabel.setForeground(Color.black);
        
        tipo.setBounds(30, 150, 300, 100);
        tipo.setFont(new Font("Kefa", Font.BOLD, 20));
        tipo.addActionListener(e -> tipoAction());
        
        add(titulo);
        add(tipo);
        add(tipoLabel);
        
    }
    
    private void tipoAction(){
        
        String stipo = (String) tipo.getSelectedItem();
        
        switch(stipo){
            case "Estandar":
                break;
            case "Temporal":
                break;
            case "Ventas":
                break;
        }
        
        repaint();
        
        
        
    }
    
    private final JComboBox<String> tipo = new JComboBox<>(new String[]{"Estandar", "Temporal", "Ventas"});
    private final JLabel titulo = new JLabel("Registrar Empleado");
    private final JLabel tipoLabel = new JLabel("Tipo de Empleado:");
    
    public static void main(String[] args) {
        new RegistrarEmpleado().setVisible(true);
    }
    
}
