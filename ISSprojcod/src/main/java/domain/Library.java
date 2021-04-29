package domain;
import java.util.*;

public class Library extends Entity<Long> {
    Librarian librarian;
    List<Subscriber> sbsList;

    public Library() {
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public List<Subscriber> getSbsList() {
        return sbsList;
    }

    public void setSbsList(List<Subscriber> sbsList) {
        this.sbsList = sbsList;
    }
}
