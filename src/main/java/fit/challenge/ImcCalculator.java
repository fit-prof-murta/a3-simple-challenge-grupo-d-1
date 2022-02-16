package fit.challenge;
public class ImcCalculator {
    public static String calculate(double peso, double altura){
        double imc = peso / (altura * altura);

        if (imc <= 18.5) return "Magreza";
        if (imc <= 25.00) return "Normal";
        if (imc < 30) return "Sobrepeso";
        return "Obesidade";        
    }

}
