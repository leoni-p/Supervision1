package uk.cam.ac.uk.lxp20.supo1;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.ac.cam.lxp20.supo1.FunctionalArray;

@RunWith(JUnit4.class)
public class FunctionalArrayTest {

    @Test
    public void functionalArray_constructorCreatesEmptyList_onInput0 () {
        //ARRANGE

        //ACT
        FunctionalArray f = new FunctionalArray(0);

        //ASSERT
        assertThat(f.getSize()).isEqualTo(0);
    }

    @Test
    public void functionalArray_constructorCreatesListLength1_onInput1 () {
        //ARRANGE

        //ACT
        FunctionalArray f = new FunctionalArray(1);

        //ASSERT
        assertThat(f.getSize()).isEqualTo(1);
    }

    @Test
    public void functionalArray_constructorCreatesListContainingZero_onInput1 () {
        //ARRANGE

        //ACT
        FunctionalArray f = new FunctionalArray(1);

        //ASSERT
        assertThat(f.get(0)).isEqualTo(0);
    }

    @Test
    public void functionalArray_constructorCreatesListContainingZeroes_onInput3 () {
        //ARRANGE

        //ACT
        FunctionalArray f = new FunctionalArray(3);

        //ASSERT
        assertThat(f.get(0)).isEqualTo(0);
        assertThat(f.get(1)).isEqualTo(0);
        assertThat(f.get(2)).isEqualTo(0);
        assertThat(f.getSize()).isEqualTo(3);
    }

    @Test
    public void functionalArray_getThrowsException_onInputOutOfRange () {
        //ARRANGE
        FunctionalArray f = new FunctionalArray(3);

        //ACT
        boolean fail = false;
        try {
            f.get(3);
        } catch (IllegalArgumentException e) {
            fail = true;
        }

        //ASSERT

        assertThat(fail).isTrue();
    }

    @Test
    public void functionalArray_setThrowsException_onInputOutOfRange () {
        //ARRANGE
        FunctionalArray f = new FunctionalArray(3);

        //ACT
        boolean fail = false;
        try {
            f.set(3,10);
        } catch (IllegalArgumentException e) {
            fail = true;
        }

        //ASSERT

        assertThat(fail).isTrue();
    }

    @Test
    public void functionalArray_setChangesValue_onListLength1 () {
        //ARRANGE
        FunctionalArray f = new FunctionalArray(1);

        //ACT

        f.set(0,10);


        //ASSERT
        assertThat(f.get(0)).isEqualTo(10);
    }

    @Test
    public void functionalArray_setChangesCorrectValue_onListLength5 () {
        //ARRANGE
        FunctionalArray f = new FunctionalArray(5);

        //ACT
        f.set(0,1);
        f.set(1,10);
        f.set(2,20);
        f.set(3,30);
        f.set(4,40);


        //ASSERT
        assertThat(f.get(0)).isEqualTo(1);
        assertThat(f.get(1)).isEqualTo(10);
        assertThat(f.get(2)).isEqualTo(20);
        assertThat(f.get(3)).isEqualTo(30);
        assertThat(f.get(4)).isEqualTo(40);
    }


}
