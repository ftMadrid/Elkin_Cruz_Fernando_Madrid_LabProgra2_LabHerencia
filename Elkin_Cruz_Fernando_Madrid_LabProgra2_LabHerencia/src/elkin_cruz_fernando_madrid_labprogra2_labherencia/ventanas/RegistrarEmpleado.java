package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.*;

public class RegistrarEmpleado extends JFrame {

    public RegistrarEmpleado() {
        initVentana();
        initComponentes();
    }

    private void initVentana() {

        setSize(800, 600);
        setTitle("HERENCIA");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

    }

    private void initComponentes() {
        setLayout(null);

        titulo.setBounds(30, 20, 400, 40);
        titulo.setFont(new Font("Kefa", Font.BOLD, 32));
        add(titulo);

        tipoLabel.setBounds(30, 80, 150, 30);
        tipo.setBounds(180, 80, 200, 30);
        tipo.addActionListener(e -> tipoAction());
        add(tipoLabel);
        add(tipo);

        codigoLabel.setBounds(30, 120, 150, 30);
        codigo.setBounds(180, 120, 200, 30);
        add(codigoLabel);
        add(codigo);

        nombreLabel.setBounds(30, 160, 150, 30);
        nombre.setBounds(180, 160, 200, 30);
        add(nombreLabel);
        add(nombre);

        salarioLabel.setBounds(30, 200, 150, 30);
        salario.setBounds(180, 200, 200, 30);
        add(salarioLabel);
        add(salario);

        horasLabel.setBounds(30, 240, 150, 30);
        horas.setBounds(180, 240, 200, 30);
        add(horasLabel);
        add(horas);

        temporal.setBounds(180, 280, 200, 30);
        temporal.setVisible(false);
        add(temporal);

        fechaContrato.setBounds(180, 320, 200, 30);
        fechaContrato.setVisible(false);
        add(fechaContrato);
    }

    private void tipoAction() {
        String stipo = (String) tipo.getSelectedItem();
        boolean esTemporal = "Temporal".equals(stipo);

        temporal.setVisible(esTemporal);
        fechaContrato.setVisible(esTemporal);

        repaint();
    }

    private final JComboBox<String> tipo = new JComboBox<>(new String[]{"Estandar", "Temporal", "Ventas"});
    private final JLabel titulo = new JLabel("Registrar Empleado");
    private final JLabel tipoLabel = new JLabel("Tipo de Empleado:");
    private final JLabel codigoLabel = new JLabel("Codigo:");
    private final JLabel nombreLabel = new JLabel("Nombre:");
    private final JLabel salarioLabel = new JLabel("Salario Base:");
    private final JLabel horasLabel = new JLabel("Horas Trabajadas:");
    private final JTextField codigo = new JTextField();
    private final JTextField nombre = new JTextField();
    private final JTextField salario = new JTextField();
    private final JTextField horas = new JTextField();
    private final JTextField temporal = new JTextField("Horas contratadas:");
    private final JDateChooser fechaContrato = new JDateChooser(); // ← nuevo

    public static void main(String[] args) {
        new RegistrarEmpleado().setVisible(true);
    }

}
