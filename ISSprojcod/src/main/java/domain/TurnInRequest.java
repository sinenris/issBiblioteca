package domain;

public class TurnInRequest extends Entity<Long>{
    private State state;
    private int rating;
    private long bookId;
    private long subscriberId;

    public TurnInRequest(Long id, State state, int rating, long bookId, long subscriberId) {
        super.setId(id);
        this.state = state;
        this.rating = rating;
        this.bookId = bookId;
        this.subscriberId = subscriberId;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(long subscriberId) {
        this.subscriberId = subscriberId;
    }
}
