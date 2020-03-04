public class TelephoneNotificationHandler extends Handler {

    public TelephoneNotificationHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.TELEFONE.equals(request.getType())){
            System.out.println("Sending TELEPHONE Notification: " + request.getMessage());
        }else {
            dispatchToNext(request);
        }
    }
}
