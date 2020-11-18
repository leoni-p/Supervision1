package uk.ac.cam.lxp20.supo1;

public class FunctionalArray {
    private BinaryTreeNode mHead;
    private int size;

    private void populate (int s, BinaryTreeNode head) {
        if (s > 2) {
            head.setLeft(new BinaryTreeNode(0));
            head.setRight(new BinaryTreeNode(0));
            populate((int) Math.ceil(s/2),head.getLeft());
            populate((int) Math.floor(s/2),head.getRight());
        } else if (s == 2) {
            head.setLeft(new BinaryTreeNode(0));
            head.setRight(new BinaryTreeNode(0));
        } else if (s ==1) {
            head.setLeft(new BinaryTreeNode(0));
        }
    }


    public FunctionalArray (int size) {
        this.size = size;
        if (size == 0) {
            mHead = null;
        } else {
            mHead = new BinaryTreeNode(0);
            populate(size-1, mHead);
        }
    }

    private void set1 (int index, int value, BinaryTreeNode head) {
        if (index == 0) {
            head.setValue(value);
        } else if (Math.floorMod(index, 2) == 0) {
            set1 ((int) Math.floor((index-1)/2), value, head.getRight());
        } else {
            set1 ((index-1)/2, value, head.getLeft());
        }
    }

    public void set (int index, int value) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        set1 (index, value, mHead);
    }

    private int get1 (int index, BinaryTreeNode head) {
        if (index == 0){
            return head.getValue();
        } else if (Math.floorMod(index, 2)== 0) {
            return get1 ((int) Math.floor((index-1)/2), head.getRight());
        }
        return get1 ((index-1)/2, head.getLeft());

    }

    public int get (int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        return get1(index, mHead);
    }

    public int getSize() {
        return size;
    }



}
