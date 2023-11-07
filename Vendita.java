package JavaWeb;

public class Vendita {
    //Crea una classe Vendita che registra gli acquisti dei clienti.

    
    private int id;
    private Cliente cliente;
    private Giocattolo giocattolo;
    private double importo;
    
    public Vendita(int id, Cliente cliente, Giocattolo giocattolo, double importo) {
        this.id = id;
        this.cliente = cliente;
        this.giocattolo = giocattolo;
        this.importo = importo;
     

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Giocattolo getGiocattolo() {
        return giocattolo;
    }

    public void setGiocattolo(Giocattolo giocattolo) {
        this.giocattolo = giocattolo;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }  
}
