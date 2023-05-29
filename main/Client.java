package main.Laundry.main;

import java.util.ArrayList;

public class Client implements User,id{

    /* Deklarasi Array List*/
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<String> telephone = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    /* Constructor */
    public Client() {
        addClient("Nuevalen Refitra A","Jl Ontoseno 7 no 69","081230350677");
        addClient("Recha Audria R.E","Jl Ontoseno 8 no 96","0812345698910");
        
    }

    /* Method addClient */
    public void addClient(String name, String address, String telephone){
        setName(name);
        setAddress(address);
        setTelephone(telephone);
    }

    /*_________ Ovveride Methode ____________*/                                  // Ovveride from class user
    /* Method setter */
    public void setName (String name){
        this.name.add(name);
    }
    public void setAddress (String address){
        this.address.add(address);
    }
    public void setTelephone (String telephone){
        this.telephone.add(telephone);
    }

    /* Method Getter */
    public String getName(int idClient){
        return this.name.get(idClient);
    }
    public String getAddress (int idClient){
        return this.address.get(idClient);
    }
    public String getTelephone (int idClient){
        return this.telephone.get(idClient);
    }
    public int getClient(){
        return this.name.size();
    }

    public int getSaldo(){
        return this.saldo.size();
    }



}
