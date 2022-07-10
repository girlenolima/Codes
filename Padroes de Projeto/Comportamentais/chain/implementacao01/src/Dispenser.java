public class Dispenser {

    private Bill chain; // primeiro elemento da cadeia

    public Dispenser() {
        this(new Bill(100),
                new Bill(50),
                new Bill(25),
                new Bill(10),
                new Bill(5),
                new Bill(1));
    }

    //A magica do chain começa aqui
    public Dispenser(Bill... bills) {
        for (int index = 0; index < bills.length - 1; index++) {

            Bill currentBill = bills[index];
            currentBill.setNext(bills[index + 1]);

        }

        chain = bills[0];
        //Seta o objeto chain com objeto bill da posiçao zero
        //O objeto bill posiçao zero tem referencia do proximo objeto e assim por diante.
    }

    public void withDraw(Integer amout) {
        chain.execute(amout);

    }
}
