package exercicios;

import java.util.Scanner;

// Faça um programa usando Linguagem Java, que calcule a quantidade de litros de
// combustível consumidos em uma viagem, sabendo-se que o carro tem autonomia de 12
// km por litro de combustível. O programa deverá ler o tempo decorrido na viagem e a
// velocidade média e aplicar as fórmulas:
// D = T * V
// L = D/12
// Em que:
// • D = Distância percorrida em horas
// • T = Tempo decorrido
// • V = Velocidade média
// • L = Litros de combustível consumidos

public class Ex10 implements IOperacao{
    private double distancia;
    private double tempo;
    private double velocidade;
    private double litros;

    @Override
    public void Executar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tempo decorrido em horas: ");
        this.tempo = sc.nextDouble();
        System.out.println("Informe a velocidade média: ");
        this.velocidade = sc.nextDouble();
        this.distancia = this.tempo * this.velocidade;
        this.litros = this.distancia / 12;
        sc.close();
    }

    @Override
    public void Imprimir() {
        System.out.println("Distância percorrida: " + this.distancia);
        System.out.println("Litros consumidos: " + this.litros);
    }
}
