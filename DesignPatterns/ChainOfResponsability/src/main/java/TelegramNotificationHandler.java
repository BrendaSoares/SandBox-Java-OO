public class TelegramNotificationHandler extends Handler {

    public TelegramNotificationHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.TELEGRAM.equals(request.getType())){
            System.out.println("Sending TELEGRAM Notification: " + request.getMessage());
        }else {
            dispatchToNext(request);
        }
    }
}
