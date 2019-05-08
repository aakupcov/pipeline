package by.anjei;

import java.util.List;

/**
 * Created by xxxx on 18.07.2018.
 */
public class Task {

    private String name;
    private String description;
    private Status status;
    private String action;
    private String startTime;
    private String endTime;
    private List<String> previousOnes;
    private List<String> nextOnes;

    public Task() {
        this.status = Status.PENDING;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", status=").append(status);
        sb.append(", action='").append(action).append('\'');
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
