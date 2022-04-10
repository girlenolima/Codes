package services;

import model.Card;

import java.util.Map;

public class CardService {

    private Map<Long, Card> memory;


    public CardService() {

    }
    public CardService(Map<Long, Card> memory) {
        this.memory = memory;
        memory.put(123456L, new Card(123456L,11223344L));

    }



    public Card getCardByUser(Long l){
        return memory.get(l);

    }

    public void removeCard(Card card){
        memory.remove(card.getCardNumber());
    }

    public Card creatNewCard(Long user, Long cardNumber){
        Card newCard = new Card(user,cardNumber);
        memory.put(user,newCard);
        System.out.println("Creating the new card : " + newCard);
        return newCard;

    }
}
