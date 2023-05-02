package UF2.agenda;

public class agenda {
    public int año=0;

    public agenda(){}

    public agenda (int a){
        año = a;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public avançarPagina(){
        
    }

    public pagina llegirPagina(){
        pagina p = new pagina();
        return p;
    }
}
