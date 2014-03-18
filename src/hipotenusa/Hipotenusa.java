/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusa;

/**
 *
 * @author User
 */
public class Hipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Formulario resultado = new Formulario ();
    resultado.setVisible(true);
    }
    

    private double lado1;
    private double lado2;
            
    private double hipotenusa;

    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the hipotenusa
     */
    public double getHipotenusa() {
        return hipotenusa;
    }

    /**
     * @param hipotenusa the hipotenusa to set
     */
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    
    
  
    }
 public double hipo(double lado1, double lado2){
    return hipotenusa = Math.sqrt(Math.pow(lado1, 2)+ Math.pow(lado2, 2));

}
 
}

