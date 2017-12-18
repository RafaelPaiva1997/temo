/**
 * Created by Ting on 2017/1/19.
 */
import com.opensymphony.xwork2.ActionSupport;
import models.organizacoes.Faculdade;
import rmi.RMIInterface;

import java.rmi.registry.LocateRegistry;

public class HelloWorldAction extends ActionSupport{
    private static final long serialVersionUID = 1L;

    private String nome;

    public String execute() throws Exception {
        try {
            Faculdade faculdade = new Faculdade();
            if (!faculdade.getNome().equals(nome) && !faculdade.update("nome", nome))
                return ERROR;
            RMIInterface rmi = (RMIInterface) LocateRegistry.getRegistry("127.0.0.1", 9000).lookup("rmi-object");
            rmi.insert(faculdade);
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
