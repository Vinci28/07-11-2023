package JavaWeb;

public class Giocattolo {
    //Crea una classe Giocattolo con campi come id, nome, prezzo e età consigliata

    private String nome; 
    private int id; 
    private int prezzo; 
    private int eta_consigliata;

    public Giocattolo(String nome, int id, int prezzo, int eta_consigliata) {
        this.nome = nome;
        this.id = id;
        this.prezzo = prezzo;
        this.eta_consigliata = eta_consigliata;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getEta_consigliata() {
        return eta_consigliata;
    }

    public void setEta_consigliata(int eta_consigliata) {
        this.eta_consigliata = eta_consigliata;
    }
    
}
