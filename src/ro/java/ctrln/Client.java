package ro.java.ctrln;

import java.util.Objects;

public class Client {

    private String Clientname;
    private int ClientId;

    @Override
    public String toString() {
        return "Client{" +
                "Clientname='" + Clientname + '\'' +
                ", ClientId=" + ClientId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return ClientId == client.ClientId && Clientname.equals(client.Clientname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Clientname, ClientId);
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public String getClientname() {
        return Clientname;
    }

    public void setClientname(String clientname) {
        Clientname = clientname;
    }
}
