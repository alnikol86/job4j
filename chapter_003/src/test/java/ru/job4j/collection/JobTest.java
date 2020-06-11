package ru.job4j.collection;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;

import java.util.Comparator;

public class JobTest {
    @Test
    public void whenComparatorName() {
        Comparator<Job> cmpName = new JobDeskByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorPriority() {
        Comparator<Job> cmpPriority = new JobDeskByPriority();
        int rsl = cmpPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenComparatorRName() {
        Comparator<Job> cmpRName = new JobDeskByNameReverse();
        int rsl = cmpRName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenComparatorRPriority() {
        Comparator<Job> cmpRPriority = new JobDeskByPriorityReverse();
        int rsl = cmpRPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDeskByName().thenComparing(new JobDeskByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobDeskByPriority().thenComparing(new JobDeskByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenComparatorByRevNameAndRevPriority() {
        Comparator<Job> cmpRNameRPriority = new JobDeskByNameReverse().thenComparing(new JobDeskByPriorityReverse());
        int rsl = cmpRNameRPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenComparatorByRPriorityAndRName() {
        Comparator<Job> cmpRPriorityRName = new JobDeskByPriorityReverse().thenComparing(new JobDeskByNameReverse());
        int rsl = cmpRPriorityRName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}
