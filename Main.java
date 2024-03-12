import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

// Classe que representa o dispositivo IoT
class DispositivoIoT {
    private String id;
    private double temperatura;

    // Construtor da classe DispositivoIoT
    public DispositivoIoT(String id) {
        this.id = id;
        this.temperatura = 0.0; // Inicializa a temperatura como 0°C
    }

    // Método para ler a temperatura do sensor conectado ao dispositivo
    public void lerTemperatura() {
        // Aqui, você pode implementar a lógica para ler a temperatura de um sensor real
        // Neste exemplo, vamos simular uma temperatura aleatória para demonstração
        Random random = new Random();
        this.temperatura = 20 + (random.nextDouble() * 15); // Temperatura aleatória entre 20°C e 35°C
    }

    // Método para enviar os dados de temperatura para o servidor
    public void enviarDadosParaServidor() {
        System.out.println("Enviando dados do dispositivo " + id + " para o servidor: Temperatura = " + formatarTemperatura(temperatura) + "°C");
        // Código para enviar os dados para o servidor
        // Aqui normalmente você teria algum código de comunicação com o servidor IoT
    }
    
    // Método para formatar a temperatura com um número específico de casas decimais
    private String formatarTemperatura(double temperatura) {
        // Definindo o formato desejado para a temperatura
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        DecimalFormat df = new DecimalFormat("#.##", symbols); // Aqui você pode alterar o formato conforme necessário
        return df.format(temperatura);
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

        // Ler temperatura do sensor e enviar para o servidor
        dispositivo.lerTemperatura();
        dispositivo.enviarDadosParaServidor();
    }
}
