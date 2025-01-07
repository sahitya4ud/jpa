package lockersystem;


import org.springframework.stereotype.Component;

@Component
public class Locker {
    private int lockerid;
    private String owner;
    private String status;

    public int getLockerid() {
        return lockerid;
    }

    public void setLockerid(int lockerid) {
        this.lockerid = lockerid;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
