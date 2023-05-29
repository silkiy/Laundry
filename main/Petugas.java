package main.Laundry.main;

import java.util.ArrayList;

public class Petugas implements User, id  {

    /* Deklarasi Array List*/
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<String> telephone = new ArrayList<String>();
    private ArrayList<Integer> position = new ArrayList<Integer>();

    /* Constructor */
    Petugas (){
        this.name.add("Mounti");
        this.address.add("Nganjuk");
        this.telephone.add("083526456731");
        this.position.add(0);
    }

    /* Method setter */
    public void setName(String name) {
        this.name.add(name);
    }

    public void setAddress(String adrress) {
        this.address.add(adrress);
    }

    public void setTelephone(String telephone) {
        this.telephone.add(telephone);
    }


    /* Method Getter */
    public String getName(int idOfficer) {
        return this.name.get(idOfficer);}
    public String getAddress(int idOfficer) {
        return this.address.get(idOfficer);
    }
    public String getTelephone(int idOfficer) {
        return this.telephone.get(idOfficer);
    }
    public int getPetugas(){
        return this.name.size();
    }
}