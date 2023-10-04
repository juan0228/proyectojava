
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class GestorCitas {
    private static final String NOMBRE_ARCHIVO = "AgendaCitas.txt";
    private static final SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");
    private static final String AgendaCitas = "C:\\PROYECTO_JAVA\\Programa_Citas_Medicas\\AgendaCitas.txt";


    public static void guardarCita(String areaMedica, String doctor, String tipoSangre, String fecha, String horario) {
        String datosCita = areaMedica + "," + doctor + "," + tipoSangre + "," + fecha + "," + horario;

          try {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        FileWriter writer = new FileWriter(archivo, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(datosCita);
        bufferedWriter.newLine();

        bufferedWriter.close();

        System.out.println("Cita guardada exitosamente.");
    } catch (IOException e) {
        System.out.println("Error al guardar la cita: " + e.getMessage());
    }
    
    }
}
