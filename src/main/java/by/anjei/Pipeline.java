package by.anjei;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by xxxx on 18.07.2018.
 */
public class Pipeline {

    private String name;
    private String description;
    private Status status;
    private String startTime;
    private String endTime;
    private List<Task> tasks;
    private List<Map<String, String>> transitions;

    public Pipeline() {
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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Map<String, String>> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<Map<String, String>> transitions) {
        this.transitions = transitions;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pipeline{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", status=").append(status);
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", tasks=").append(tasks == null ? "null" : Arrays.asList(tasks).toString());
        sb.append(", transitions=").append(transitions);
        sb.append('}');
        return sb.toString();
    }
}
