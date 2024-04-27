import random

def inicio():
    impar_ou_par = input("Bora jogar impar ou par?\nVou deixar você escolher primeiro (digite 'i' para impar ou 'p' para par)\n")
    
    num_usuario = int(input("Digite um número de 1 a 100: "))
    num_pc = random.randint(1, 100)
    
    print("Eu escolhi o número: ", num_pc)
    
    soma = num_usuario + num_pc
    
    print("Resultado: ", soma)
    if soma % 2 == 0:
    
        print("Deu par!")
        if impar_ou_par == "p":
            print("Você ganhou, parabéns!") 
        else:
            print("Você perdeu, que pena!")  
    else:
        print("Deu Impar")
        if impar_ou_par == "i": 
            print("Você ganhou, parabéns!")
        else:
            print("Você perdeu, que pena! Tente novamente")

inicio()