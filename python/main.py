import random  # Importa o módulo random para gerar números aleatórios
import time  # Importa o módulo time para lidar com operações de tempo

class SensorMovimento:
    def read_data(self):
        return random.choice([True, False])  # Retorna aleatoriamente True (movimento detectado) ou False (sem movimento)

def main():
    sensor_movimento = SensorMovimento()  # Cria um objeto do sensor de movimento

    for _ in range(5):  # Repete o processo 5 vezes
        movimento_detectado = sensor_movimento.read_data()  # Lê os dados do sensor de movimento
        if movimento_detectado:  # Se movimento detectado for True
            print("Movimento detectado!")  # Imprime que movimento foi detectado
        else:  # Se movimento detectado for False
            print("Nenhum movimento detectado.")  # Imprime que nenhum movimento foi detectado
        time.sleep(1)  # Espera 1 segundo antes de continuar para simular a leitura do sensor em intervalos de tempo

if __name__ == "__main__":
    main()  # Chama a função main se o script for executado diretamente