package elkin_cruz_fernando_madrid_labprogra2_labherencia;

import java.util.Calendar;

public class Empleado {

    private final Empleado[] ListaEmpleados = new Empleado[100];
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
    public Empleado(){
    
    }
    public void registrarhoras(int horastrabajadas) {
        horas = horastrabajadas;
    }

    public double calculopago() {
        double pago = (horas / 160) * salario;
        double deduccion = pago * 0.035;
        return pago - deduccion;

    }

    public Empleado buscar(int codigo) {

        for (int i = 0; ListaEmpleados.length < 10; i++) {
            if (codigo == ListaEmpleados[i].codigo) {
                return ListaEmpleados[i];
            }

        }
        return null;
    }

    public String mostrarinfo() {
        return "Codigo: " + codigo + "\n Nombre: " + "\n Fecha de contratacion: " + fecha;
    }
}
