package AnalizadorDOsCero;
import java.io.*;

public class Buscador {

	FileInputStream entrada;
	FileOutputStream salida;
	File archivo;
	
	public Buscador() {
		try {
			salida = new FileOutputStream(archivo);
		}catch(Exception e) {
			
		}
	}
	
	//Esta madre guarda
	public String AbrirTexto(File archivo) {
		
		String contenido = "";
		
		try {
			entrada = new FileInputStream(archivo);
			int ascci;
			while((ascci = entrada.read()) != -1) {
				char caracter = (char) ascci;
				contenido += caracter;
			}
		}catch(Exception e) {	
			e.printStackTrace();
		}	
		
		System.out.println(contenido);
		
		return contenido;
	}
	
	public String guardar(File arc,String doc){
		String mgs=null;
		try {
			salida=new FileOutputStream(arc);
			byte[] byt=doc.getBytes();
			salida.write(byt);
			mgs="Archivo guardado";
			
		}catch(Exception e) {
			
		}
		
		return mgs;
	}
	
}