  
/* import java.util.Scanner; */

public class MostraPessoa {
    public static void main (String args[]) {
        Pessoa p1 = new Pessoa ("Isabel", 21, 1.60, 60, "feminino");
            p1.mostrarDados();
            p1.calcula();
            p1.informa();
        

        Pessoa p2 = new Pessoa ("David", 21, 1.705,  54, "masculino");
            p2.mostrarDados();
            p2.calcula();
            p2.informa();
    };
}
