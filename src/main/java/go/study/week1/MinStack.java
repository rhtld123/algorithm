package go.study.week1;

import java.util.*;

public class MinStack {
  Stack<Integer> stack = new Stack<>();
  PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());

  public MinStack() {

  }

  public void push(int val) {
    stack.push(val);
    queue.add(val);
  }

  public void pop() {
    Integer pop = stack.pop();
    if (pop != null) {
      Integer peek = queue.peek();
      if (peek == pop) {
        queue.poll();
      } else {
        queue.remove(pop);
      }
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return queue.peek();
  }
}
