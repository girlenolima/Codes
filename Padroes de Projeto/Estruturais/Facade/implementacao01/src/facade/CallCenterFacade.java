package facade;

import model.Card;
import model.Register;
import services.*;

import java.util.List;

public class CallCenterFacade {

    private CardService cardService;
    private RegisterService registerService;
    private ReportService reportService;
    private PaymentService paymentService;
    private SecurityService securityService;

    public CallCenterFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        reportService = new ReportService(registerService);
        paymentService = new PaymentService(registerService);
        securityService = new SecurityService(cardService,registerService);
    }
    public Card gerCardByUser(Long l){
        return cardService.getCardByUser(l);
    }

    public void getSumary(Card card){
        reportService.getSumary(card);
    }

    public void getPaymentInfoByCard(Card card){
        paymentService.getPaymentInfoByCard(card);
    }

    public void cacelLastRegister(Card card){

        List<Register> registers = registerService.getRegistersByCard(card);
        registerService.removeByIndex(card,registers.size() -1);
        List<Register> pedinRegisters = securityService.blockCard(card);
        Card newCard = cardService.creatNewCard(123456L, 33445566L);
        registerService.addCardRegisters(newCard,pedinRegisters);
        reportService.getSumary(newCard);

    }


}
