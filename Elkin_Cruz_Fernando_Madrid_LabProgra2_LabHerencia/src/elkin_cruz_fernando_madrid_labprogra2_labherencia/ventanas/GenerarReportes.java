package elkin_cruz_fernando_madrid_labprogra2_labherencia.ventanas;

import elkin_cruz_fernando_madrid_labprogra2_labherencia.Empleado;
import javax.swing.*;

public class GenerarReportes extends JFrame {

    public GenerarReportes() {
        setTitle("Herencia");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setBounds(20, 20, 440, 280);
        add(scroll);

        botonGenerar = new JButton("Generar Reporte");
        botonGenerar.setBounds(170, 320, 150, 30);
        add(botonGenerar);

        botonGenerar.addActionListener(e -> {
            String texto = Empleado.listar();
            if (texto.equals("")) {
                areaTexto.setText("No hay empleados registrados.");
            } else {
                areaTexto.setText(texto);
            }
        });

        setVisible(true);
    }

    private final JLabel titulo = new JLabel("Generar Reportes de Empleados");
    private JTextArea areaTexto;
    private JButton botonGenerar;

    public static void main(String[] args) {
        new GenerarReportes().setVisible(true);
    }

}
