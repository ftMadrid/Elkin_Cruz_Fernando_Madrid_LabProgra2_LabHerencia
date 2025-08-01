package elkin_cruz_fernando_madrid_labprogra2_labherencia;

public class EmpleadoVentas extends Empleado {

    public double[] ventas = new double[12];
    private final double tasacomision = 1.5;

    public EmpleadoVentas(int codigo, String nombre, double salario, int horas) {
        super(codigo, nombre, salario, horas);
    }

    public void registrodeventas(double monto, int month) {
        ventas[month] = monto;
    }

    public double Calculocomision(int month) {
        return ventas[month] * tasacomision;
    }

    public double calculopagomensual(int month) {
        return this.salario += Calculocomision(month);
    }

    public int ventasanuales() {
        int ventasanual = 0;
        for (int i = 0; ventas.length < 10; i++) {
            ventasanual += ventas[i];
        }
        return ventasanual;

    }

    @Override
    public String mostrarinfo() {
        return super.mostrarinfo() + "\n Ventas anuales: " + ventasanuales();

    }
}
