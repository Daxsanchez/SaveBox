package utilerias;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author daxsa
 */
public class Utileria {
    
    private static SimpleDateFormat formato;
    public static final int ANIO_MES_DIA = 1;
    public static final int ANIO_MES_DIA_HORA = 5;
    public static final int DIA_MES_ANIO = 2;
    public static final int ANIO_MES_DIA_B = 3;

    public static Date sumarRestarDias(Date fecha, int dias) {
        if (dias == 0) {
            return fecha;
        }
        Calendar cale = Calendar.getInstance();
        cale.setTime(fecha);
        cale.add(Calendar.DAY_OF_YEAR, dias);
        return cale.getTime();
    }

    public static Date sumarRestarMeses(Date fecha, int mes) {
        if (mes == 0) {
            return fecha;
        }
        Calendar cale = Calendar.getInstance();
        cale.setTime(fecha);
        cale.add(Calendar.MONTH, mes);
        return cale.getTime();
    }

    public static Date sumarRestarAnio(Date fecha, int year) {
        if (year == 0) {
            return fecha;
        }
        Calendar cale = Calendar.getInstance();
        cale.setTime(fecha);
        cale.add(Calendar.YEAR, year);
        return cale.getTime();
    }
    
    public static String getFechaFormateada(Date fecha, int tipoFormato) {
        formato = new SimpleDateFormat("yyyy-MM-dd");
        if (tipoFormato == DIA_MES_ANIO) {
            formato = new SimpleDateFormat("dd-MM-yyyy");
        }
        if (tipoFormato == ANIO_MES_DIA_B) {
            formato = new SimpleDateFormat("dd/MM/yyyy");
        }
        if(tipoFormato == ANIO_MES_DIA_HORA){
            formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        }
        return formato.format((Date) fecha);
    }
}
