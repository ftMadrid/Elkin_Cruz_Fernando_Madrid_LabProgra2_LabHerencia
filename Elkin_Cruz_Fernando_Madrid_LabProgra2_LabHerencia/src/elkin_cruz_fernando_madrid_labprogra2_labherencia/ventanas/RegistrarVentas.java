package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import elkin_cruz_fernando_madrid_labprogra2_labherencia.Empleado;
import elkin_cruz_fernando_madrid_labprogra2_labherencia.EmpleadoVentas;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.*;

public class RegistrarVentas extends JFrame {

    public RegistrarVentas() {
        initVentana();
        initComponentes();
    }

    private void initVentana() {

        setSize(700, 600);
        setTitle("HERENCIA");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

    }

    private void initComponentes() {
        labelcodigo.setBounds(50, 90, 200, 30);
        txtCodigo.setBounds(250, 90, 200, 30);

        labelventas.setBounds(20, 130, 200, 30);
        textoVentas.setBounds(230, 130, 200, 30);

        titulo.setBounds(80, 20, 400, 40);
        titulo.setFont(new Font("Kefa", Font.BOLD, 28));
        titulo.setForeground(Color.black);

        btnGuardar.setBounds(250, 200, 150, 30);
        btnRegresar.setBounds(50, 200, 150, 30);

        btnGuardar.addActionListener(e -> {

            String codigoEmpleado = txtCodigo.getText();
            int codigo = Integer.parseInt(codigoEmpleado);
            String ventas = textoVentas.getText();
            int ventasnum = Integer.parseInt(ventas);

            Empleado empleadoencontrado = Empleado.buscar(codigo);
            if (empleadoencontrado != null) {
                if (empleadoencontrado instanceof EmpleadoVentas) {
                    EmpleadoVentas ventasemp = (EmpleadoVentas) empleadoencontrado;
                    ventasemp.registrodeventas(ventasnum, 0);
                    JOptionPane.showMessageDialog(null, "Se ha registrado la ventas", "Aviso", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El empleado no es de tipo ventas", "Aviso", JOptionPane.ERROR_MESSAGE);
                }

            }

        });
        btnRegresar.addActionListener(e -> {
            Principal p = new Principal();
            p.setVisible(true);
            this.dispose();

        });

        add(titulo);
        add(labelcodigo);
        add(txtCodigo);
        add(labelventas);
        add(textoVentas);
        add(btnGuardar);
        add(btnRegresar);
    }

    private final JLabel titulo = new JLabel("Registrar Ventas ");
    private final JLabel labelcodigo = new JLabel("Ingrese codigo del empleado: ");
    private final JLabel labelventas = new JLabel("Ingrese ventas realizadas: ");
    private final JTextField txtCodigo = new JTextField();
    private final JTextField textoVentas = new JTextField();
    private final JButton btnGuardar = new JButton("Guardar Ventas");
    private final JButton btnRegresar = new JButton("Regresar");

    public static void main(String[] args) {
        new RegistrarVentas().setVisible(true);
    }

}
