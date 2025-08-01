package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame{
    
    public Principal(){
        initVentana();
        initComponentes();
    }
    
    private void initVentana(){
        
        setSize(700, 650);
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
        
        rempleados.setBounds(30, 160, 300, 50);
        rempleados.setFont(new Font("Kefa", Font.BOLD, 20));
        rempleados.setForeground(Color.black);
        rempleados.addActionListener(e -> rempleadosAction());
        
        rhoras.setBounds(30, 220, 300, 50);
        rhoras.setFont(new Font("Kefa", Font.BOLD, 20));
        rhoras.setForeground(Color.black);
        rhoras.addActionListener(e -> rhorasAction());
        
        rventas.setBounds(30, 280, 300, 50);
        rventas.setFont(new Font("Kefa", Font.BOLD, 20));
        rventas.setForeground(Color.black);
        rventas.addActionListener(e -> rventasAction());
        
        acfechafin.setBounds(30, 340, 300, 50);
        acfechafin.setFont(new Font("Kefa", Font.BOLD, 18));
        acfechafin.setForeground(Color.black);
        acfechafin.addActionListener(e -> acfechafinAction());
        
        calculopagom.setBounds(30, 400, 300, 50);
        calculopagom.setFont(new Font("Kefa", Font.BOLD, 20));
        calculopagom.setForeground(Color.black);
        calculopagom.addActionListener(e -> calculopagomAction());
        
        greportesempleados.setBounds(30, 460, 300, 50);
        greportesempleados.setFont(new Font("Kefa", Font.BOLD, 20));
        greportesempleados.setForeground(Color.black);
        greportesempleados.addActionListener(e -> greportesempleadosAction());
        
        buscarempleado.setBounds(30, 520, 300, 50);
        buscarempleado.setFont(new Font("Kefa", Font.BOLD, 20));
        buscarempleado.setForeground(Color.black);
        buscarempleado.addActionListener(e -> buscarempleadoAction());
        
        add(titulo);
        add(rempleados);
        add(rventas);
        add(acfechafin);
        add(calculopagom);
        add(greportesempleados);
        add(buscarempleado);
        add(rhoras);
        
    }
    
    private void rempleadosAction(){
        dispose();
        new RegistrarEmpleado().setVisible(true);
    }
    
    private void rhorasAction(){
        dispose();
        new RegHorasTrabajadas().setVisible(true);   
    }
    
    private void rventasAction(){
        dispose();
        new RegistrarVentas().setVisible(true); 
    }
    
    private void acfechafinAction(){
        dispose();
        new ACFechaFin().setVisible(true); 
    }
    
    private void calculopagomAction(){
        dispose();
        new CalcularPago().setVisible(true); 
    }
    
    private void greportesempleadosAction(){
        dispose();
        new GenerarReportes().setVisible(true); 
    }
    
    private void buscarempleadoAction(){
        dispose();
        new BuscarEmpleados().setVisible(true); 
    }
    
    private final JLabel titulo = new JLabel("Gestion General");
    private final JButton rempleados = new JButton("Registrar Empleados");
    private final JButton rhoras = new JButton("Registrar Horas Trabajdas");
    private final JButton rventas = new JButton("Registrar Ventas");
    private final JButton acfechafin = new JButton("Actualizar Fecha Fin de Contrato");
    private final JButton calculopagom = new JButton("Calcular Pago Mensual");
    private final JButton greportesempleados = new JButton("Generar Reportes");
    private final JButton buscarempleado = new JButton("Buscar Empleados");
    
    public static void main(String[] args) {
        new Principal().setVisible(true);
    }
    
}
