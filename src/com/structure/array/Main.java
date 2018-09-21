package com.structure.array;

import com.structure.array.queue.LoopQueue;
import com.structure.array.queue.Queue;

import java.util.Random;
import java.util.Stack;

/**
 * @author pp-sir
 * @date 2018/9/19 11:13
 */
public class Main {

    public static void main(String[] args) {

        int opCount = 1000000;
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//        double time1 = testQueue(arrayQueue, opCount);
//        System.out.println(time1);
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println(time2);

    }

    // 测试使用q运行opCount个enqueueu和dequeue操作所需要的时间，单位：秒
    private static double testQueue(Queue<Integer> q, int opCount) {

        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("c" + i + ":" + c);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                System.out.println("stack:" + stack.toString());
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                System.out.println("topChar:" + topChar);
                System.out.println("stack:" + stack.toString() + "\n");
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
