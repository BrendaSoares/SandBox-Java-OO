public class EmailNotificationHandler extends Handler {

    public EmailNotificationHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.EMAIL.equals(request.getType())) {
            System.out.println("Sending EMAIL Notification: " + request.getMessage());
        }else {
            dispatchToNext(request);
        }
    }
}

