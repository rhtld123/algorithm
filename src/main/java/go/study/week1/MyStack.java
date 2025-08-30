package go.study.week1;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

  private Queue<Integer> masterQueue = new LinkedList<>();
  private Queue<Integer> slaveQueue = new LinkedList<>();

  public MyStack() {

  }

  public void push(int x) {
    if (masterQueue.isEmpty()) {
      masterQueue.add(x);
      return;
    }

    slaveQueue.addAll(masterQueue);
    masterQueue.clear();
    masterQueue.add(x);
    masterQueue.addAll(slaveQueue);
    slaveQueue.clear();
  }

  public int pop() {
    return masterQueue.poll();
  }

  public int top() {
    slaveQueue.addAll(masterQueue);
    return slaveQueue.poll();
  }

  public boolean empty() {
    return masterQueue.isEmpty();
  }
}
