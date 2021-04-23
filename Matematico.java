
public class Matematico{
    private Calculadora calcu;
    
    public Matematico(Calculadora calculadora){
        calcu = calculadora;
    }
    
    public String ordenarNumeros(int a, int b, int c){
        int aux = 0;
        String resp = "el mayor es "+a+", el del medio es "+b+" y el menor es "+c;
        if (a>=b){
            if (b>=c){
                resp = resp;
            }else{
                if (a>=c){
                    resp = "el mayor es "+a+", el del medio es "+c+" y el menor es "+b;
                }else{
                    resp = "el mayor es "+c+", el del medio es "+a+" y el menor es "+b;
                }
            }
        }else{
            if (c>=b){
                resp = "el mayor es "+c+", el del medio es "+b+" y el menor es "+a;
            }else{
                if (a>=c){
                    resp = "el mayor es "+b+", el del medio es "+a+" y el menor es "+c;
                }else{
                    resp = "el mayor es "+b+", el del medio es "+c+" y el menor es "+a;
                }
            }
        }
        return resp;
    }
        
    
    public double areaCuadrado(double base, double altura){
        double resultado = base * altura;
        return resultado;
    }
    public double distanciaPuntos(int x1, int y1, int x2, int y2){
        double distancia;
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1),2);
        distancia = Math.sqrt(x+y);
        return distancia;
    }
    public String verificarCuadrante(double x, double y){
        String cuadrante = null;
        if (x > 0 && y > 0){
            cuadrante = "el punto se encuentra en el primer cuadrante";
        }else{
            if (x < 0 && y > 0){
                cuadrante = "el punto se encuentra en el segundo cuadrante";
            }else{
                if (x < 0 && y < 0){
                    cuadrante = "el punto se encuentra en el tercer cuadrante";
                }else{
                    if(x > 0 && y < 0){
                        cuadrante = "el punto se encuentra en el cuarto cuadrante";                     
                    }
                }
            }
        }
        return cuadrante;
    }
    public String calcularRaices(int a, int b, int c){
        String resp1 = calcu.getResul();
        return resp1;       
        
    }
    public String valorCateto(int hipotenusa, int cateto){
        String resp2 = calcu.getResul3();
        return resp2;
    }
    public String ecuacionRecta(int x1, int x2, int y1, int y2){
        String resp3 = calcu.getResul2();
        return resp3;
    }
}

