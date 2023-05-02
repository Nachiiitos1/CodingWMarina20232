package UF2.figures;

public class Rectangle {
    public int base;
    public int alçada;
    public String color;



    /**
     * @param c sirve para asignar un color
     */
    /*public Rectangle(String c){
        color=c;
    }
    public Rectangle(int a, int b, String c){
        alçada=a;
        base=b;
        color=c;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAlçada() {
        return alçada;
    }

    public void setAlçada(int alçada) {
        this.alçada = alçada;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }*/
    public Rectangle(int a, int b, String c){
        color=c;
        alçada=a;
        base=b;
    }
    public Rectangle(){}
}
