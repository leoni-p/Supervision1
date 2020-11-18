package uk.cam.ac.uk.lxp20.supo1;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.ac.cam.lxp20.supo1.SearchSet;


@RunWith(JUnit4.class)
public class SearchSetTest {
    @Test
    public void SearchSet_insertWorksCorrectly_whenSetIsEmpty () {
        //ARRANGE
        SearchSet s = new SearchSet();

        //ACT
        s.insert(5);

        //ASSERT
        assertThat(s.getNumberElements()).isEqualTo(1);
        assertThat(s.contains(5)).isTrue();

    }

    @Test
    public void SearchSet_insertWorksCorrectly_onMultipleInserts () {
        //ARRANGE
        SearchSet s = new SearchSet();

        //ACT
        s.insert(5);
        s.insert(4);
        s.insert(10);
        s.insert(-3);

        //ASSERT
        assertThat(s.getNumberElements()).isEqualTo(4);
        assertThat(s.contains(5)).isTrue();
        assertThat(s.contains(4)).isTrue();
        assertThat(s.contains(10)).isTrue();
        assertThat(s.contains(-3)).isTrue();

    }

    @Test
    public void SearchSet_insertThrowsException_onItemOnlyItemInList () {
        //ARRANGE
        SearchSet s = new SearchSet();
        s.insert(5);

        //ACT
        boolean fail = false;
        try  {
           s.insert(5);
        } catch (IllegalArgumentException e) {
            fail = true;
        }

        //ASSERT
        assertThat(fail).isTrue();
        assertThat(s.getNumberElements()).isEqualTo(1);
    }

    @Test
    public void SearchSet_containsReturnsFalse_onItemsNotInList () {
        //ARRANGE
        SearchSet s = new SearchSet();

        //ACT
        s.insert(5);
        s.insert(4);
        s.insert(10);
        s.insert(-3);

        //ASSERT
        assertThat(s.contains(20)).isFalse();
    }


}
