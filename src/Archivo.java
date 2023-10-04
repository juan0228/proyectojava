
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Archivo {
    
    File archivo;
    
    public void CrearArchivo(){
        try{
            archivo = new File("AgendaPacientes.txt");
            if(archivo.createNewFile()){
                JOptionPane.showMessageDialog(null, "Archivo creado...");
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    public void escribirEnArchivo(Persona persona){
        try{
            FileWriter escritura = new  FileWriter(archivo,true);
            escritura.write(persona.getCodigo() + "-" + persona.getNombre() + "-" + persona.getDni() + "-" + persona.getFecha() + "-" + persona.getDireccion() + "-" + persona.getGenero() + "\r\n");
            escritura.close();
        
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}
