package elkin_cruz_fernando_madrid_labprogra2_labherencia;

import java.util.Calendar;

public class Empleado {

    private static Empleado[] ListaEmpleados = new Empleado[100];
    protected int codigo;
    protected String nombre;
    protected Calendar fecha;
    protected double salario;
    protected int horas;

    public Empleado(int codigo, String nombre, double salario, int horas) {
        this.codigo = codigo;
        this.nombre = nombre;
        fecha = Calendar.getInstance();
        this.salario = salario;
        this.horas = horas;
    }

    public void registrarhoras(int horastrabajadas) {
        horas = horastrabajadas;
    }

    public double calculopago() {
        double pago = (horas / 160) * salario;
        double deduccion = pago * 0.035;
        return pago - deduccion;

    }

    public static Empleado buscar(int codigo) {
        for (Empleado ListaEmpleado : ListaEmpleados) {
            if (ListaEmpleado != null && ListaEmpleado.codigo == codigo) {
                return ListaEmpleado;
            }
        }
        return null;
    }

    public static void agregarEmpleado(Empleado emp) {
        for (int i = 0; i < ListaEmpleados.length; i++) {
            if (ListaEmpleados[i] == null) {
                ListaEmpleados[i] = emp;
                return;
            }
        }
    }

    public String mostrarinfo() {
        return "\nCodigo: " + codigo + "\nNombre: " + nombre + "\nFecha de contratacion: " + +fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR);
    }
}
