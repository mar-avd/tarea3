
public class Calculadora
{
    private String result1, result2, result3;
    private Matematico matematico;
    public Calculadora(){
        result1 = null;
        result2 = null;
        result3 = null;
    }
    
    public void ecuacion2Grado(int a, int b, int c){
        String raices;
        double aux1, aux2, x1,x2, aux;
        aux = (b*b - 4 * a * c);
        if (aux > 0){
            aux1 = -b + Math.sqrt(aux);
            aux2 = -b - Math.sqrt(aux);
            x1 = aux1/2*a;
            x2 = aux2/2*a;
            raices = "las raices son " + x1 + " y " + x2;
        }else{
            raices = "las raices son imaginarias";
        }
        result1 = raices;
    }
    public void ecuacionRecta(int x1, int x2, int y1, int y2){
        double m, y, aux;
        m = (y2 - y1)/(x2 - x1);
        aux = m * x1;
        y = aux + y1;
        result2 = "la ecuacion de la recta = "+ m +"x"+ y ;
    }
    public void encontrarCateto(int hipot, int cateto){
        double c;
        double aux = hipot*hipot - cateto*cateto;
        c = Math.sqrt(aux);
        result3 = "el valor del cateto faltante es "+ c;
    }
    public String getResul(){
        return result1;
    }
    public String getResul2(){
        return result2;
    }
    public String getResul3(){
        return result3;
    }
}
