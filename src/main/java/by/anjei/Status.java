package by.anjei;

/**
 * Created by xxxx on 18.07.2018.
 */
public enum Status {
    IN_PROGRESS(1),
    SKIPPED(2),
    FAILED(3),
    COMPLETED(4),
    PENDING(5);

    private int status;

    Status(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
