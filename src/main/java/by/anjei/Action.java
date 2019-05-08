package by.anjei;

import java.util.Random;

public enum Action implements Actionable<Task>{
    PRINT {
        public void doAction(Task task) {
            System.out.println("Task name is : " + task.getName());
            task.setStatus(Status.COMPLETED);
        }
    },
    RANDOM {
        public void doAction(Task task) {
            System.out.println("Task name is : " + task.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            task.setStatus(generateStatus());
        }

        private Status generateStatus () {
            int randomStatus = new Random().nextInt(Status.values().length);
            for (Status status : Status.values()) {
                if (randomStatus == status.getStatus()) {
                    return status;
                }
            }
            throw new IllegalArgumentException("Invalid status was generated!");
        }
    },
    COMPLETED {
        public void doAction(Task task) {
            System.out.println("Task name is : " + task.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            task.setStatus(Status.COMPLETED);
        }
    },
    DELAYED {
        public void doAction(Task task) {
            System.out.println("Task name is : " + task.getName());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            task.setStatus(Status.COMPLETED);
        }
    };



}
