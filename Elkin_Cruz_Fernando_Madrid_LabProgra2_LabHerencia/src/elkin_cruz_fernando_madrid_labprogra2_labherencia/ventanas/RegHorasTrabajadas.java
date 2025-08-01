package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import elkin_cruz_fernando_madrid_labprogra2_labherencia.Empleado;
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
         labelcodigo.setBounds(20, 80, 200, 30);
    txtCodigo.setBounds(230, 80, 200, 30);

    labelhoras.setBounds(20, 130, 200, 30);
    textoHoras.setBounds(230, 130, 200, 30);

    titulo.setBounds(30, 20, 500, 50);
    titulo.setFont(new Font("Kefa", Font.BOLD, 32));
    titulo.setForeground(Color.black);

   
    btnGuardar.setBounds(250, 200, 150, 30);
    btnRegresar.setBounds(50, 200, 150, 30);

    
    btnGuardar.addActionListener(e -> {
        
        String codigoEmpleado = txtCodigo.getText();
        int codigo=Integer.parseInt(codigoEmpleado);
        String horasTrabajadaslabel = textoHoras.getText();
        int horas=Integer.parseInt(horasTrabajadaslabel);
        Empleado emp=new Empleado();
        if(emp.buscar(codigo)!=null){
        emp.registrarhoras(horas);
        }else{
        JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error", JOptionPane.PLAIN_MESSAGE);
        }
        
        
    });
    btnRegresar.addActionListener(e ->{
    Principal p= new Principal();
    p.setVisible(true);
    this.dispose();
        
        });
   
    add(titulo);
    add(labelcodigo);
    add(txtCodigo);
    add(labelhoras);
    add(textoHoras);
    add(btnGuardar);
    add(btnRegresar);
}
    
    private final JLabel titulo = new JLabel("Registrar Horas Trabajadas");
    private final JLabel labelcodigo=new JLabel("Ingrese codigo del empleado: ");
    private final JLabel labelhoras=new JLabel("Ingrese horas trabajadas: ");
    private final JTextField txtCodigo = new JTextField();
    private final JTextField textoHoras=new JTextField();
    private final JButton btnGuardar = new JButton("Guardar Horas");
    private final JButton btnRegresar=new JButton("Regresar");

    
    
    public static void main(String[] args) {
        new RegHorasTrabajadas().setVisible(true);
    }
    
}
