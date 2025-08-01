
package elkin_cruz_fernando_madrid_labprogra2_labherencia;

import java.util.Calendar;


public class EmpleadoTemporal extends Empleado {

protected Calendar fechafincontrato; 
protected int yearfin;
protected int monthfin;
protected int diafin;
    public EmpleadoTemporal(int codigo, String nombre, int year, int month, int day, double salario, int horas,int yearfin,int monthfin,int diafin) {
        super(codigo, nombre, year, month, day, salario, horas);
        this.fechafincontrato.set(yearfin, monthfin, diafin);
    }
 public double pagoCondicionado(){
 Calendar fechahoy=Calendar.getInstance();
 
 if(fechahoy.before(fechafincontrato)){
 return super.calculopago();
 }else if(fechahoy.after(fechafincontrato)){
 return 0;
 }else{
 return super.calculopago();
 }
 }
 public void newfechafin(int year,int month,int day){
 this.fechafincontrato.set(year,month, day);
 }  
@Override
public String mostrarinfo(){
return super.mostrarinfo()+"Fin del contrato: "+fechafincontrato;
}
}
