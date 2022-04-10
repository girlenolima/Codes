package model;

public class Card {


    private Long userNumer;
    private Long carNumber;

    public Card(Long userNumer, Long carNumber) {
        this.userNumer = userNumer;
        this.carNumber = carNumber;
    }

    public Long getUserNumer() {
        return userNumer;
    }

    public void setUserNumer(Long userNumer) {
        this.userNumer = userNumer;
    }

    public Long getCardNumber() {
        return carNumber;
    }

    public void setCarNumber(Long carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "userNumer=" + userNumer +
                ", carNumber=" + carNumber +
                '}';
    }
}
