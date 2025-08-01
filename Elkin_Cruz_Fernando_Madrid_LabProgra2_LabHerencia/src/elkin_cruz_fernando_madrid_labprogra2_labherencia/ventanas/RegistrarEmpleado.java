package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import com.toedter.calendar.JDateChooser;
import elkin_cruz_fernando_madrid_labprogra2_labherencia.Empleado;
import elkin_cruz_fernando_madrid_labprogra2_labherencia.EmpleadoTemporal;
import elkin_cruz_fernando_madrid_labprogra2_labherencia.EmpleadoVentas;
import java.awt.Font;
import java.util.Calendar;
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

        tipoLabel.setBounds(30, 80, 150, 30);
        tipo.setBounds(180, 80, 200, 30);
        tipo.addActionListener(e -> tipoAction());

        codigoLabel.setBounds(30, 120, 150, 30);
        codigo.setBounds(180, 120, 200, 30);

        nombreLabel.setBounds(30, 160, 150, 30);
        nombre.setBounds(180, 160, 200, 30);

        salarioLabel.setBounds(30, 200, 150, 30);
        salario.setBounds(180, 200, 200, 30);

        horasLabel.setBounds(30, 240, 150, 30);
        horas.setBounds(180, 240, 200, 30);

        fechaLabel.setBounds(30, 280, 200, 30);
        fechaLabel.setVisible(false);

        fechaContrato.setBounds(180, 280, 200, 30);
        fechaContrato.setVisible(false);

        registrar.setBounds(30, 320, 200, 50);
        registrar.addActionListener(e -> registrarAction());

        regresar.setBounds(230, 320, 200, 50);
        regresar.addActionListener(e -> regresarAction());

        add(titulo);
        add(tipoLabel);
        add(tipo);
        add(codigoLabel);
        add(codigo);
        add(nombreLabel);
        add(nombre);
        add(salarioLabel);
        add(salario);
        add(horasLabel);
        add(horas);
        add(fechaLabel);
        add(fechaContrato);
        add(registrar);
        add(regresar);

    }

    private void registrarAction() {

        int cod = Integer.parseInt(codigo.getText());
        String nom = nombre.getText();
        double sal = Double.parseDouble(salario.getText());
        int hrs = Integer.parseInt(horas.getText());
        String tipoEmpleado = (String) tipo.getSelectedItem();

        if (Empleado.buscar(cod) == null) {
            if ("Temporal".equals(tipoEmpleado)) {
                java.util.Date fecha = fechaContrato.getDate();
                Calendar cal = Calendar.getInstance();
                cal.setTime(fecha);
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                EmpleadoTemporal emp = new EmpleadoTemporal(cod, nom, sal, hrs, year, month, day);
                Empleado.agregarEmpleado(emp);
                JOptionPane.showMessageDialog(this, "Empleado Temporal registrado:\n" + emp.mostrarinfo(), "Proceso Exitoso", JOptionPane.INFORMATION_MESSAGE);

            } else if ("Ventas".equals(tipoEmpleado)) {
                EmpleadoVentas emp = new EmpleadoVentas(cod, nom, sal, hrs);
                Empleado.agregarEmpleado(emp);
                JOptionPane.showMessageDialog(this, "Empleado de Ventas registrado:\n" + emp.mostrarinfo(), "Proceso Exitoso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                Empleado emp = new Empleado(cod, nom, sal, hrs);
                Empleado.agregarEmpleado(emp);
                JOptionPane.showMessageDialog(this, "Empleado registrado:\n" + emp.mostrarinfo(), "Proceso Exitoso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ya existe un empleado con ese código.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        dispose();
        new Principal().setVisible(true);

    }

    private void regresarAction() {
        dispose();
        new Principal().setVisible(true);
    }

    private void tipoAction() {

        String stipo = (String) tipo.getSelectedItem();
        boolean esTemporal = "Temporal".equals(stipo);

        fechaLabel.setVisible(esTemporal);
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
    private final JLabel fechaLabel = new JLabel("Fecha Fin:");
    private final JDateChooser fechaContrato = new JDateChooser();
    private final JButton registrar = new JButton("Registrar");
    private final JButton regresar = new JButton("Regresar");

    public static void main(String[] args) {
        new RegistrarEmpleado().setVisible(true);
    }

}
