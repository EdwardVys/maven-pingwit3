package org.example.lec_4.homework.task_2;

public class ExecutionQueue {
    private static String msg;

    static {
        msg = "statik block"; // statik -> static
    }

    {
        msg = "regular init block";
    }

    public ExecutionQueue() {
        msg = "constructor value";
    }

    public static void main(String[] arg) {
        ExecutionQueue executionQueue = new ExecutionQueue();
        System.out.println(executionQueue.msg);
    }
}
