public class Disciplina {
    ICalcmedia calcMedia;
    double P1, P2, media;
    String Nome, Situacao;
    
    public void setCalcMedia(ICalcmedia calcMedia) {
        this.calcMedia = calcMedia;
    }
    public void setP1(double p1) {
        P1 = p1;
    }
    public void setP2(double p2) {
        P2 = p2;
    }
    public ICalcmedia getCalcMedia() {
        return calcMedia;
    }
    public double getP1() {
        return P1;
    }
    public double getP2() {
        return P2;
    }
    public double getMedia() {
        return media;
    }
    public String getNome() {
        return Nome;
    }
    public String getSituacao() {
        return Situacao;
    }

    public void CalculaMedia(){
        media = calcMedia.CalculaMedia(P1, P2);
        Situacao = calcMedia.Situacao(media);
    }

    public Disciplina(){

    }

    public Disciplina(ICalcmedia calcmedia){
        this.calcMedia = calcmedia;
    }
}
