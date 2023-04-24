public class SportineMasina extends Masina {

    private int didziausiasGreitis;
    public SportineMasina(String marke, String modelis, int metai, int dureliuSkaicius, int didziausiasGreitis) {
        super(marke, modelis, metai, dureliuSkaicius);
        this.didziausiasGreitis = didziausiasGreitis;
    }
    public int getdidziausiasGreitis(){
        return didziausiasGreitis;
    }
    public static void main(String[]args){
        SportineMasina masina = new SportineMasina("Audi", "TT",2000, 2, 250);
        System.out.println("Masinos marke: " + masina.getMarke() + ". Modelis: " +  masina.getModelis() + ". Metai: " +
                masina.getMetai() + ". Dureliu skaicius: " + masina.getDureliuSkaicius() + ". Didziausias sios masinos " +
                "greitis: " + masina.getdidziausiasGreitis() + " km/h.");
    }
}
