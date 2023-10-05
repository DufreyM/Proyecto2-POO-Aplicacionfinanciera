class DeudasYCredito {
    private double deudas;
    private double credito;

    public DeudasYCredito() {
        this.deudas = 0;
        this.credito = 0;
    }

    public void mostrarCredito() {
        System.out.println("Cantidad de crédito actual: " + this.credito);
    }

    public void mostrarDeudas() {
        System.out.println("Cantidad de deudas: " + this.deudas);
    }

    public void cancelarDeudas() {
        if (this.deudas > 0) {
            System.out.println("Para cancelar las deudas, necesitas gastar " + this.deudas + " de crédito.");
            this.credito -= this.deudas;
            this.deudas = 0;
        } else {
            System.out.println("No tienes deudas que cancelar.");
        }
    }
}