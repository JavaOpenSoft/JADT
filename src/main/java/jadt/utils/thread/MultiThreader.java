package jadt.utils.thread;
import java.util.ArrayList;

public class MultiThreader {
    ArrayList <ThreadTask> tasks = new ArrayList<>();
    public void addTask(ThreadTask task){
        tasks.add(task);
    }
    public ThreadTask getTask(int threadIndex){
        return tasks.get(threadIndex);
    }
    public void removeTask(int threadIndex){
        tasks.remove(threadIndex);
    }
    public void clearTasks(){
        tasks.clear();
    }
    public void startSpecificTask(int threadIndex){
        tasks.get(threadIndex).start();
    }
    public void startAllTasks(){
        for(int i=0;i<tasks.size();i++){
            tasks.get(i).start();
        }
    }

}