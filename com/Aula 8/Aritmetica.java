public class Aritmetica implements ICalcmedia{
    @Override
    public double CalculaMedia(double a, double b) {
        return (a+b)/2;
    }

    @Override
    public String Situacao(double media) {
        if(media > 5)
            return "Aprovado";
        return "Reprovado";
    }
}
