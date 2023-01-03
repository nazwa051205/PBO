package enkapsul;

public class Mobil {
    private String Jenis;
    private String Merk;
    private String Plat;
    private String Nama;
    private String Warna;
    
    public void setJenis(String J){
        Jenis=J;
    }
    public String getJenis(){
        return Jenis;
    }
    public void setMerk(String M){
        Merk=M;
    }
    public String getMerk(){
        return Merk;
    }
    public void setPlat(String P){
        Plat = P ; 
    }
    public String getPlat(){
        return Plat ;
    } 
    public void setNama(String N ){
        Nama = N ;
    }
    public String getNama(){
        return Nama;
    }
    public void setWarna(String W ){
        Warna = W ;
    }
    public String getWarna(){
        return Warna;
    }
    public void infoS4(){
        System.out.println("jenis = "+getJenis());
        System.out.println("Merk = "+getMerk());
        System.out.println("Nomor Plat = "+getPlat ());
        System.out.println("Nama pemilik = "+getNama());
        System.out.println("Warna = "+getWarna());
    }
}