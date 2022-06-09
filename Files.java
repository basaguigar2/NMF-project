package operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Files {
	public double[][] entrada(String ruta) {
	try {
		    File arc = new File(ruta);
		 	FileReader r = new FileReader(arc);
	        BufferedReader buffer = new BufferedReader(r);

	        String temp = "";
	        ArrayList<String> lines = new ArrayList<>();

	        while ((temp = buffer.readLine()) != null) {
	            lines.add(temp);//Lee las n lineas de tu archivo
	        }
	        String[] numbers = lines.get(0).split(",");
	        int x = numbers.length;//Obtenemos la cantidad de numeros por linea
	        int y = lines.size();//Obtenemos la cantidad de lineas
	        double[][] matrix = new double[x][y];
	        //Llenamos la matriz linea por linea
	        for (int j = 0; j < y; j++) {
	            String[] line = lines.get(j).split(",");
	            for (int i = 0; i < x; i++) {
	                matrix[i][j] = Double.parseDouble(line[i]);
	            }
	        }
	        buffer.close();
	        return matrix;
	} catch (FileNotFoundException e) {
		System.out.println("No se encuentra archivo");
		e.printStackTrace();
	} catch (NumberFormatException e) {
		System.out.println("No se pudo convertir a entero");
		e.printStackTrace();
	} catch (java.io.IOException e) {
		e.printStackTrace();
	}
	return null;
	
	}


	public void salida(double [][] mat, String ruta){
			   FileWriter fw = null;
			   try {
			     fw = new FileWriter(ruta+".txt");
			     for (int i=0; i<mat.length; i++){
			       if (i>0){
			         fw.write(System.getProperty("line.separator")); //nueva línea
			       }
			       for (int j=0; j<mat[i].length; j++){
			    	  fw.write(Double.toString(mat[i][j]));
			       }
			     }
			   } catch (IOException e) {
			      e.printStackTrace();
			   }
			   finally{
			      if (fw!=null){
			         try {
			            fw.close();
			         } catch (IOException e) {
			             e.printStackTrace();
			         }
			         fw = null;
			      }
			   }		
	}
}
