# ˚ ୨୧ ⋆ ｡ ˚ ⋆

# Seminário - Computação Ubíqua e Internet das Coisas.

### Criação de algoritmos

Este repositório foi criado com o propósito de centralizar os códigos desenvolvidos para o seminário universitário sobre Computação Ubíqua e Internet das Coisas.

Serão apresentados quatro tipos de algoritmos simples relacionados a esses temas, implementados nas seguintes linguagens: Java, Python, JavaScript e C.

Foi solicitado a criação de algoritmos simples com exemplos práticos dos conceitos abordados durante o seminário. Cada algoritmo deve conter comentários explicativos e explicações passo a passo para facilitar a compreensão por parte de pessoas não familiarizadas com o assunto. Além disso, foi requisitada uma breve explicação geral sobre o funcionamento do código e o significado de cada elemento utilizado.

Em resumo, este código demonstra como um dispositivo IoT pode gerar dados de temperatura e enviá-los para um servidor para processamento ou armazenamento dos dados. Ele fornece uma introdução básica ao conceito de IoT e comunicação entre dispositivos e servidores. Neste exemplo, os dados são simplesmente impressos no console, mas normalmente haveria código real para enviar os dados pela rede para um servidor remoto.

## Explicação linha por linha:

1. import java.util.Scanner;: Importa a classe Scanner para permitir a entrada de dados do usuário.

2. import java.util.Random;: Importa a classe Random para gerar números aleatórios.

3. class DispositivoIoT { ... }: Define uma classe chamada DispositivoIoT, que representa um dispositivo da Internet das Coisas.

4. class Main { ... }: Define uma classe chamada Main, que contém o método principal do programa.

5. public static void main(String[] args) { ... }: O ponto de entrada do programa, onde a execução começa.

6. Scanner scanner = new Scanner(System.in);: Cria um objeto Scanner para ler entradas do usuário.

7. System.out.print("Por favor, insira o ID do seu dispositivo: ");: Exibe uma mensagem para solicitar ao usuário que insira o ID do dispositivo.

8. String idDispositivo = scanner.nextLine();: Lê a entrada do usuário (ID do dispositivo) e armazena na variável idDispositivo.

9. scanner.close();: Fecha o objeto Scanner para liberar recursos.

10. DispositivoIoT dispositivo = new DispositivoIoT(idDispositivo);: Cria um objeto de DispositivoIoT com o ID fornecido pelo usuário.

11. dispositivo.gerarTemperatura();: Gera uma temperatura aleatória para o dispositivo.

12. dispositivo.enviarDadosParaServidor();: Envia os dados de temperatura para o servidor.

Neste exemplo, os dados são simplesmente impressos no console, mas normalmente haveria código real para enviar os dados pela rede para um servidor remoto.