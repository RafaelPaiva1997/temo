/**
 * Created by Ting on 2017/1/19.
 */
public class MessageStore {
    private String message;

    public MessageStore() {

        setMessage("Hello Struts User");
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
