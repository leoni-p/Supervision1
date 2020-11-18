package uk.ac.cam.lxp20.supo1;

public class SearchSet {
    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet() {
        mElements = 0;
        mHead = null;
    }


    private static BinaryTreeNode into (int n, BinaryTreeNode head) {
        if (head == null) {
            return new BinaryTreeNode(n);
        } else if (head.getValue() > n) {
            head.setLeft(into(n, head.getLeft()));
            return head;
        } else if (head.getValue() < n) {
            head.setRight(into(n, head.getRight()));
            return head;
        }  else {
            throw new IllegalArgumentException();
        }
    }

    public void insert(int n) {
        try {
            mHead = into(n, mHead);
            mElements++;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }



    }

    public int getNumberElements() {
        return mElements;
    }

    public boolean contains(int n) {
        BinaryTreeNode head = mHead;
        boolean found = false;
        while (found == false) {
            if (head == null) {
                break;
            } else if (head.getValue() == n) {
                found = true;
            } else if (head.getValue() > n) {
                head = head.getLeft();
            } else {
                head = head.getRight();
            }
        }
        return found;
    }

    public static void main(String[] args) {
        SearchSet s = new SearchSet();
        s.insert(5);
        s.insert(10);
        System.out.print(s.contains(5));
    }


}





