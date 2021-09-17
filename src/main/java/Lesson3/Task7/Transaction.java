package Lesson3.Task7;

import java.util.Date;

class Transaction {
    String uuid;
    State state;
    Long sum;
    Date created;

    public Transaction(String uuid, State state, Long sum, Date created) {
        this.uuid = uuid;
        this.state = state;
        this.sum = sum;
        this.created = created;
    }

    public String getUuid() {
        return uuid;
    }

    public Date getCreated() {
        return created;
    }

    public State getState() {
        return state;
    }

    public Long getSum() {
        return sum;
    }
}
