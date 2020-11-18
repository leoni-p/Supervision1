package uk.ac.cam.lxp20.supo1;

public class BinaryTreeNode {
    private int mValue;
    private BinaryTreeNode mRight;
    private BinaryTreeNode mLeft;

    public BinaryTreeNode(int value) {
        mValue = value;
        mRight = null;
        mLeft = null;
    }


    public int getValue () { return mValue; }

    public void setValue(int value) { mValue = value; }

    public BinaryTreeNode getLeft () { return mLeft; }

    public BinaryTreeNode getRight () { return mRight; }

    public void setRight (BinaryTreeNode right) { mRight = right; }

    public void setLeft (BinaryTreeNode left) { mLeft = left; }
}
