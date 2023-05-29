package main.Laundry.main;

public class Tampilan {

    /* Method Tabel Client */
    public void report(Client client){
        int x = client.getClient();

        System.out.println("\n=============  Nezuko - Info Client  =============\n");
        for(int i=0;i < x;i++){
            System.out.println("Yang Terhormat Bapak/Ibu : "+client.getName(i) +
                    "\nDengan Alamat            : " + client.getAddress(i) +
                    "\nNomor Telp.              : " + client.getTelephone(i));
        }
    }

    /* Method Tabel Jenis Launsry */
    public void report(JenisLaundry type){
        int x =  type.getType();

        System.out.println("\n==============  Nezuko - Info Laundry  ===========\n");
        for(int i=0;i < x;i++){
            System.out.println("Terdapat Jenis          : " + type.getType(i) +
                    "\nDengan Harga            : " + type.getPrice(i) +
                    " Rupiah\nDurasi                  : " + type.getDuration(i) +
                    " Menit");
            System.out.println("__________________________________________________");
        }
    }

    /* Method Nama Petugas */
    public void report(Petugas name){
        int i = 0;

        System.out.println("__________________________________________________");
        System.out.print("\nPETUGAS : ");
            System.out.println(name.getName(i));
            System.out.println("\t\t\t" + name.getAddress(i));
            System.out.println("\t\t\t" + name.getTelephone(i));
        System.out.println("__________________________________________________");
    }

    public void report(Petugas petugas2, Client client2, int index2){
        Petugas petugas = new Petugas();
        Client client = new Client ();
        int index = 0;
        report(petugas,client,index);
    }

}