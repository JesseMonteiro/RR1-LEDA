package solucao.forma;

public class Calcula {

    public double calculaAreaCirculo(double raio){
        Forma circulo = new Circulo(raio);
        return circulo.area();
    }

    public double calculaQuadrado(double lado){
        Forma quadrado = new Quadrado(lado);
        return quadrado.area();
    }

    public double calculaRetangulo(double comprimento, double altura){
        Forma quadrado = new Retangulo(comprimento, altura);
        return quadrado.area();
    }

    public double calculaTriangulo(double base, double altura){
        Forma triangulo = new Triangulo(base, altura);
        return triangulo.area();
    }

}
