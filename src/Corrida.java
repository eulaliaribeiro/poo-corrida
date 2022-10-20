public class Corrida {
    public static void main(String[] args) {
        Piloto lewis = new Piloto("Lewis Hamilton", 37, Sexo.MASCULINO, "Mercedes");
        Piloto eulalia = new Piloto("Eulália", 24, Sexo.FEMININO, "Mercedes");

        //System.out.println(lewis);
        //System.out.println(eulalia);

        CarroCorrida mercedes1 = new CarroCorrida(1, lewis, 360, 0, false);
        CarroCorrida mercedes2 = new CarroCorrida(2, eulalia, 360, 0, false);

        mercedes1.ligar();
        mercedes2.ligar();

        mercedes1.setVelocidadeAtual(200);
        mercedes2.setVelocidadeAtual(220);

        mercedes1.acelerar();
        mercedes2.frear();
        mercedes2.acelerar();
        mercedes1.frear();

        mercedes1.setVelocidadeAtual(360);
        mercedes2.setVelocidadeAtual(360);

        mercedes1.acelerar();
        mercedes2.acelerar();

        mercedes2.frear();
        mercedes1.frear();

        mercedes2.setVelocidadeAtual(0);
        mercedes2.desligar();

        mercedes1.setVelocidadeAtual(0);
        mercedes1.desligar();

        mercedes2.desligar();
        mercedes1.desligar();

        mercedes2.acelerar();
        mercedes1.frear();

    }
}
