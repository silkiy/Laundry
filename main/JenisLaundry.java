package main.Laundry.main;

import java.util.ArrayList;
import java.util.Scanner;


public class JenisLaundry extends Petugas {

    /* Deklarasi Array List*/
    private ArrayList<String> type = new ArrayList<String>();
    private ArrayList<Integer> price = new ArrayList<Integer>();
    private ArrayList<Integer> duration = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);

    /* Constructor */
    public JenisLaundry() {
        addType("Cuci",7000,10);
        addType("Cuci -> Setrika",15000, 25);
    }

    /* Method addType */
    public void addType(String type, int price, int duration){
        setType(type);
        setPrice(price);
        setDuration(duration);
    }

    /* Method addNewType */
    public void addLaundry(Petugas officer, int indexOfficer, int code){
        System.out.println("\n_________ Menambahkan Jenis Laundry Baru _________");
        System.out.print("Masukkan Jenis Laundry baru        : ");
        String laundry = input.nextLine();
        this.type.add(laundry);
        System.out.print("Masukkan Harga dari Laundry baru   : ");
        int harga = input.nextInt();
        this.price.add(harga);
        System.out.print("Berapa durasi dari Laundry baru    : ");
        int durasi = input.nextInt();
        this.duration.add(durasi);
    }

    /* Method setter */
    public void setType (String type){
        this.type.add(type);
    }
    public void setPrice (int price){
        this.price.add(price);
    }
    public void setDuration (int duration){
        this.duration.add(duration);
    }


    /* Method Getter */

    public String getType(int idType){
        return this.type.get(idType);
    }
    public int getPrice (int idType){
        return this.price.get(idType);
    }
    public int getDuration (int idType){
        return this.duration.get(idType);
    }


    public int getType(){
        return this.type.size();
    }



}