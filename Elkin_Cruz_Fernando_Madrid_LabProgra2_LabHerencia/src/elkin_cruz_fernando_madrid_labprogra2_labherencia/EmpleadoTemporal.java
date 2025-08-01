package elkin_cruz_fernando_madrid_labprogra2_labherencia;

import java.util.Calendar;

public class EmpleadoTemporal extends Empleado {

    protected int yearfin;
    protected int monthfin;
    protected int diafin;
    private Calendar fechafincontrato;

    public EmpleadoTemporal(int codigo, String nombre, double salario, int horas, int año, int mes, int dia) {
        super(codigo, nombre, salario, horas);
        this.fechafincontrato = Calendar.getInstance();
        this.fechafincontrato.set(año, mes, dia);
    }

    public double pagoCondicionado() {
        Calendar fechahoy = Calendar.getInstance();

        if (fechahoy.before(fechafincontrato)) {
            return super.calculopago();
        } else if (fechahoy.after(fechafincontrato)) {
            return 0;
        } else {
            return super.calculopago();
        }
    }

    public void newfechafin(int year, int month, int day) {
        this.fechafincontrato.set(year, month, day);
    }

    @Override
    public String mostrarinfo() {
        return super.mostrarinfo() + "\nFin del contrato: " + +fechafincontrato.get(Calendar.DAY_OF_MONTH)+"/"+(fechafincontrato.get(Calendar.MONTH)+1)+"/"+fechafincontrato.get(Calendar.YEAR);
    }
}
