import java.util.Scanner;
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