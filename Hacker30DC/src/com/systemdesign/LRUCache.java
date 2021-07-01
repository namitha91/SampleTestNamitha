package com.systemdesign;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<T> {

    private final int capacity;
    private int size;
    private final Map<String, Node> hashmap;
    private final DoublyLinkedList internalQueue;

    LRUCache(final int capacity) {
        this.capacity = capacity;
        this.hashmap = new HashMap<>();
        this.internalQueue = new DoublyLinkedList();
        this.size = 0;
    }

    public T get(final String key) {
        Node node = hashmap.get(key);
        if(node == null) {
            return null;
        }
        internalQueue.moveNodeToFront(node);
        return hashmap.get(key).value;
    }

    public void put(final String key, final T value) {
        Node currentNode = hashmap.get(key);
        if(currentNode != null) {
            currentNode.value = value;
            internalQueue.moveNodeToFront(currentNode);
            return;
        }

        if(size == capacity) {
            String rearNodeKey = internalQueue.getRearKey();
            internalQueue.removeNodeFromRear();
            hashmap.remove(rearNodeKey);
            size--;
        }

        Node node = new Node(key, value);
        internalQueue.addNodeToFront(node);
        hashmap.put(key, node);
        size++;
    }

    private class Node {
        String key;
        T value;
        Node next, prev;
        public Node(final String key, final T value) {
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private class DoublyLinkedList {
        private Node head, tail;
        public DoublyLinkedList() {
            head = tail = null;
        }

        private void addNodeToFront(final Node node) {
            if(tail == null) {
                head = tail = node;
                return;
            }
            node.next = head;
            head.prev = node;
            head = node;
        }

        public void moveNodeToFront(final Node node) {
            if(head == node) {
                return;
            }

            if(node == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }

            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }

        private void removeNodeFromRear() {
            if(tail == null) {
                return;
            }

            System.out.println("Deleting key: " + tail.key);
            if(head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }

        private String getRearKey() {
            return tail.key;
        }
    }
}