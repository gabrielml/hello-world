/** 501
 *      Construir las siguientes clases:
 *          • Clase Vehículo, con atributos matricula, color, numeroderuedas, cilindrada y potencia. 
 *              Los dos primeros serán objetos String y los tres últimos serán enteros. La clase debe
 *              tener dos constructores parametrizados diferentes y métodos setter y getter 
 *              para al menos uno de los atributos. Definir también un método toString para obtener
 *              un String con todos los datos.*/
 
public class Vehiculo {
    private String matricula;
    private String color;
    int numeroRuedas;
    int cilindrada;
    int potencia;
    
    Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    
    Vehiculo(String matricula, String color, int numeroRuedas, int cilindrada, int potencia) {
        this.matricula = matricula;
        this.color = color;
        this.numeroRuedas = numeroRuedas;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }    
    
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setnumeroRuedas(int numeroRuedas) {this.numeroRuedas = numeroRuedas;}

    public String getMatricula() {return matricula;}
    public int getnumeroRuedas() {return numeroRuedas;}
    
    public String toString() {
        return "Matrícula: " + matricula + " Color: " + color + " NºRuedas: " + numeroRuedas + " Cilindrada: "
                + cilindrada + " Potencia: " + potencia;
    }
}
