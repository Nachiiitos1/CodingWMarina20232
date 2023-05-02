public class estrellas{
    public static void main (String[] args) {
        estrellas programa = new estrellas();
        programa.inici();
    }
        public void inici(){
            estrellas(4);
            estrellas(10);
            estrellas(20);
            estrellas(10);
            estrellas(20);
            estrellas(10);
            estrellas(20);
            estrellas(10);
            estrellas(20);
            estrellas(10);
            estrellas(20);
        }
        public void estrellas(int a){
            for (int i = 0; a>i;i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

}