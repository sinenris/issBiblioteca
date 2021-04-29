package domain;

import java.util.*;

public class Subscriber extends Entity<Long> {
    private String username;
    private String password;
    private String name;
    private String address;
    private long age;
    private List<Long> bookIdList;

    public Subscriber(Long id, String username, String password, String name, String address, long age, List<Long> bookIdList) {
        super.setId(id);
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.age = age;
        this.bookIdList = bookIdList;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public List<Long> getBookIdList() {
        return bookIdList;
    }

    public void setBookIdList(List<Long> bookIdList) {
        this.bookIdList = bookIdList;
    }
}
