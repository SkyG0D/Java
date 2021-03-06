package br.com.sky.javacore.l02introducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5+5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5-5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1/num2;
        }

    }

    public int alteraDoisNumeros (int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Alteração de números 1 ");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        return 50;

    }

    public void somaArray (int[] numeros) {
        int soma = 0;
        for ( int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros) {
       int soma = 0;
       for (int num: numeros) {
           soma += num;
       }
        System.out.println(soma);
    }

}
