/**
 * Created by Ting on 2017/1/19.
 */
import com.opensymphony.xwork2.ActionSupport;
public class HelloWorldAction extends ActionSupport{
    private static final long serialVersionUID = 1L;

    private MessageStore messageStore;

    public String execute() throws Exception {

        messageStore = new MessageStore() ;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
