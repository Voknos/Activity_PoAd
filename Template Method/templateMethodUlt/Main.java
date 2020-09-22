class Main {
  public static void main(String[] args) {
    Calculadora calc = new Soma();
    calc.calculando();

    System.out.println();

    calc = new Subtracao();
    calc.calculando();

    System.out.println();

  }
}