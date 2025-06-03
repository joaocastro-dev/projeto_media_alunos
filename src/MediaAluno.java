//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MediaAluno {
    public static void main(String[] args) {
       double PrimeiroSemestre= 7;
       double SegundoSemestre =6;
       double TerceiroSemestre = 3;
       double QuartoSemestre = 2;


       double Resultado = (PrimeiroSemestre+SegundoSemestre+TerceiroSemestre+QuartoSemestre)/4;

       if(Resultado>=7){
           System.out.println("Aluno passou de ano "+Resultado);
       }
       else if(Resultado>5){
           System.out.println("Ficou de recuperação "+Resultado);
       }else{
           System.out.println("Aluno foi reprovado "+Resultado);
       }


    }
}