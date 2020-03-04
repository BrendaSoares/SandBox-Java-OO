public class Main {

    public static void main(String[] args){
        Handler telephoneHandler = new TelephoneNotificationHandler(null);
        Handler emailhandler = new EmailNotificationHandler(telephoneHandler);
        Handler telegramHandler = new TelegramNotificationHandler(emailhandler);

        Request request = new Request();
        request.setMessage("'CALL RECEIVED'");
        request.setType(RequestType.TELEFONE);

        telegramHandler.handleRequest(request);
    }
}

