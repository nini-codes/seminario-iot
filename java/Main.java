import java.util.Scanner;
import java.util.Random;

// Classe que representa o dispositivo IoT
class DispositivoIoT {
    private String id;
    private double temperatura;

    // Construtor da classe DispositivoIoT
    public DispositivoIoT(String id) {
        this.id = id;
        this.temperatura = 0.0; // Define a temperatura inicial como 0°C
    }

    // Método para gerar uma temperatura aleatória
    public void gerarTemperatura() {
        Random random = new Random();
        this.temperatura = 20 + (random.nextDouble() * 15); // Definidindo uma temperatura aleatória entre 20°C e 35°C
    }

    // Método para enviar os dados de temperatura para o servidor ficticio
    public void enviarDadosParaServidor() {
        System.out.println(
                "Enviando dados do dispositivo " + id + " para o servidor: Temperatura = " + temperatura + "°C");
        // Código para enviar os dados para o servidor
        // Utilizando print para demonstracao do programa
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Solicitar ao usuário que insira o ID do dispositivo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira o ID do seu dispositivo: ");
        String idDispositivo = scanner.nextLine();
        scanner.close();

        // Criando um objeto de dispositivo IoT com o ID fornecido pelo usuário
        DispositivoIoT dispositivo = new DispositivoIoT(idDispositivo);

        // Gerar temperatura e enviar para o servidor
        dispositivo.gerarTemperatura();
        dispositivo.enviarDadosParaServidor();
    }
}