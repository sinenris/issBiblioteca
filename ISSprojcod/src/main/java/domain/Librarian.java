package domain;

import java.util.*;

public class Librarian extends Entity<Long>{
    private String username;
    private String password;
    private String name;
    private long salary;
    private List<TurnInRequest> turnInReqs;


    public Librarian(Long id, String username, String password, String name, long salary, List<TurnInRequest> turnInReqs) {
        super.setId(id);
        this.username = username;
        this.password = password;
        this.name = name;
        this.salary = salary;
        this.turnInReqs = turnInReqs;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public List<TurnInRequest> getTurnInReqs() {
        return turnInReqs;
    }

    public void setTurnInReqs(List<TurnInRequest> turnInReqs) {
        this.turnInReqs = turnInReqs;
    }
}
