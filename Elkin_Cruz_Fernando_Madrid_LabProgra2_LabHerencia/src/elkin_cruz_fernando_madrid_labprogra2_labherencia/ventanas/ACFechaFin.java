package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import com.toedter.calendar.JDateChooser;
import elkin_cruz_fernando_madrid_labprogra2_labherencia.Empleado;
import elkin_cruz_fernando_madrid_labprogra2_labherencia.EmpleadoTemporal;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

public class ACFechaFin extends JFrame {

    public ACFechaFin() {
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

        titulo.setBounds(30, -50, 500, 300);
        titulo.setFont(new Font("Kefa", Font.BOLD, 32));
        titulo.setForeground(Color.black);

        codigoLabel.setBounds(30, 150, 150, 30);
        codigo.setBounds(100, 150, 200, 30);

        fechaLabel.setBounds(30, 200, 200, 30);
        fecha.setBounds(100, 200, 200, 30);

        registrar.setBounds(30, 320, 200, 50);
        registrar.addActionListener(e -> registrarAction());

        regresar.setBounds(230, 320, 200, 50);
        regresar.addActionListener(e -> regresarAction());

        add(titulo);
        add(codigoLabel);
        add(codigo);
        add(fechaLabel);
        add(fecha);
        add(registrar);
        add(regresar);

    }

    private void registrarAction() {

        int cod = Integer.parseInt(codigo.getText());

        Empleado emp = Empleado.buscar(cod);

        if (emp != null) {
            if (emp instanceof EmpleadoTemporal) {
                EmpleadoTemporal empt = (EmpleadoTemporal) emp;
                Date nfecha = fecha.getDate();
                Calendar cal = Calendar.getInstance();
                cal.setTime(nfecha);
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                empt.newfechafin(year, month, day);
                JOptionPane.showMessageDialog(null, "Fecha final de contrato actualizada.", "Proceso Exitoso", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Principal().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "El empleado no es temporal.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void regresarAction() {
        dispose();
        new Principal().setVisible(true);
    }

    private final JLabel titulo = new JLabel("Actualizar Fecha Fin de Contrato");
    private final JLabel codigoLabel = new JLabel("Codigo:");
    private final JTextField codigo = new JTextField();
    private final JLabel fechaLabel = new JLabel("Fecha Fin:");
    private final JDateChooser fecha = new JDateChooser();
    private final JButton registrar = new JButton("Registrar");
    private final JButton regresar = new JButton("Regresar");

    public static void main(String[] args) {
        new ACFechaFin().setVisible(true);
    }

}
