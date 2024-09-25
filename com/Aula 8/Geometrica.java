public class Geometrica implements ICalcmedia {
    @Override
    public double CalculaMedia(double a, double b) {
        return Math.sqrt(a*b);
    }

    @Override
    public String Situacao(double media) {
        if(media > 7)
            return "Aprovado";
        return "Reprovado";
    }
}
