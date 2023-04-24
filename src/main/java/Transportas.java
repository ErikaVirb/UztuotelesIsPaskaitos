public class Transportas {
   private String marke;
   private  String modelis;
   private int metai;

   public Transportas(String marke, String modelis, int metai){
       this.marke = marke;
       this.modelis = modelis;
       this.metai = metai;
    }
    public String getMarke(){
       return marke;
    }
    public String getModelis(){
       return modelis;
    }
    public int getMetai(){
       return metai;
    }
}
