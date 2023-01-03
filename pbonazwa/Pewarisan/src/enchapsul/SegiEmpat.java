package enchapsul;

public class SegiEmpat {
  private int panjang; //private -> information hiding
  private int lebar;
  
  public void setPanjang(int p){
      panjang = p;
  }
  public int getPanjang(){
      return panjang;
  }
  public void setLebar(int l){
      lebar = l;
  }
  public int getLebar(){
      return lebar;
  }
  public int hitLuas(){
      int luas;
      luas = panjang * lebar;
      return luas;
  }
  public void infoS4(){
      System.out.println("panjang = "+getPanjang());
      System.out.println("lebar = "+getLebar());
      System.out.println("luas = "+hitLuas());
  }
  
}