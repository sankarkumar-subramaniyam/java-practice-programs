package collections;

import java.util.*;

public class ListOps {

    public static void main(String[] args) {
        ListOps listOps = new ListOps();
//        listOps.LinkedListOps();
//        listOps.ArrayListOps();
//        listOps.ArrayDequeOps();
        listOps.priorityQueueOps();

    }

    private void LinkedListOps() {
        // As list
        System.out.println(" As List ");
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);
        System.out.println("at 3 : " + ll.get(3));
        System.out.println("at 4 : " + ll.get(4));

//        Collections.sort(ll, Comparator.naturalOrder());
        Collections.sort(ll, Comparator.reverseOrder());
        System.out.println(ll);
        System.out.println("at 3 : " + ll.get(3));
        System.out.println("at 4 : " + ll.get(4));

        // As Queue
        System.out.println(" As Queue ");
        ll = new LinkedList<>();
        ll.offer(1);
        ll.offer(2);
        ll.offer(3);
        ll.offer(4);
        ll.offer(5);
        System.out.println(ll);
        System.out.println("at 3 : " + ll.get(3));
        System.out.println("at 4 : " + ll.get(4));
        ll.poll();
        ll.poll();
        System.out.println(ll);

        // As Stack
        System.out.println(" As Stack ");
        ll = new LinkedList<>();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        System.out.println(ll);
        System.out.println("at 3 : " + ll.get(3));
        System.out.println("at 4 : " + ll.get(4));
        ll.poll();
        ll.poll();
        System.out.println(ll);
    }

    private void ArrayListOps() {

        // As list
        System.out.println(" As List ");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        System.out.println("at 3 : " + al.get(3));
        System.out.println("at 4 : " + al.get(4));

//        al.re
    }

    private void ArrayDequeOps() {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        // As Queue
        System.out.println(" As Queue ");
        ad.offer(1);
        ad.offer(2);
        ad.offer(3);
        ad.offer(4);
        ad.offer(5);
        System.out.println(ad);
        System.out.println("at front : " + ad.peek());
        System.out.println("at front : " + ad.peek());
        ad.poll();
        ad.poll();
        System.out.println(ad);

        // As Stack
        System.out.println(" As Stack ");
        ad = new ArrayDeque<>();
        ad.push(1);
        ad.push(2);
        ad.push(3);
        ad.push(4);
        ad.push(5);
        System.out.println(ad);
        System.out.println("at front : " + ad.peek());
        System.out.println("at front : " + ad.peek());
        ad.poll();
        ad.poll();
        System.out.println(ad);


    }

    private void priorityQueueOps() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // As Queue
        System.out.println(" As Queue ");
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        System.out.println(pq);
        System.out.println("Size : " + pq.size());
        System.out.println("at front : " + pq.peek());
        System.out.println("at front : " + pq.peek());
        System.out.println("Size : " + pq.size());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println("Size : " + pq.size());

        System.out.println("frequency of 5 : " + Collections.frequency(pq, 5));
        System.out.println("frequency 0f 3 : " + Collections.frequency(pq, 3));

        // As Queue
        System.out.println(" As Queue reverseOrder ");
        pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        System.out.println(pq);
        System.out.println("at front : " + pq.peek());
        System.out.println("at front : " + pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
