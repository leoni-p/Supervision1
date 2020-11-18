package uk.cam.ac.uk.lxp20.supo1;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.ac.cam.lxp20.supo1.BinaryTreeNode;


@RunWith(JUnit4.class)
public class BinaryTreeNodeTest {
    @Test
    public void BinaryTreeNode_Constructor_WorksCorrectly () {
        //ARRANGE

        //ACT
        BinaryTreeNode n = new BinaryTreeNode(5);

        //ASSERT
        assertThat(n.getValue()).isEqualTo(5);
        assertThat(n.getLeft()).isNull();
        assertThat(n.getRight()).isNull();
    }

    @Test
    public void BinaryTreeNode_setValue_WorksCorrectly() {
        //ARRANGE
        BinaryTreeNode n = new BinaryTreeNode(1);

        //ACT
        n.setValue(2);

        //ASSERT
        assertThat(n.getValue()).isEqualTo(2);
    }

    @Test
    public void BinaryTreeNode_setLeft_WorksCorrectly() {
        //ARRANGE
        BinaryTreeNode n = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(7);

        //ACT
        n.setLeft(left);

        //ASSERT
        assertThat(n.getLeft()).isEqualTo(left);
    }

    @Test
    public void BinaryTreeNode_setRight_WorksCorrectly() {
        //ARRANGE
        BinaryTreeNode n = new BinaryTreeNode(1);
        BinaryTreeNode right = new BinaryTreeNode(7);

        //ACT
        n.setRight(right);

        //ASSERT
        assertThat(n.getRight()).isEqualTo(right);
    }


}
