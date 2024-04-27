import java.util.Random;

class DispositivoIoT{
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
        this.temperatura = 20 + (random.nextDouble() * 15); // Definindo uma temperatura aleatória entre 20°C e 35°C
    }

    // Método para enviar os dados de temperatura para o servidor ficticio
    public void enviarDadosParaServidor() {
        String temperaturaFormatada = String.format("%.2f", temperatura);
        System.out.println(
                "Enviando dados do dispositivo " + id + " para o servidor: Temperatura = " + temperaturaFormatada + "°C");
                // Código para enviar os dados para o servidor
                // Utilizando print para demonstracao do programa
    }
}