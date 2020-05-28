package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobDescByNameIncrease() {
        Comparator<Job> cmpNamePriority = new JobDescByNameIncrease();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(4));
    }
    @Test
    public void whenJobDescByNameDecrease() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDecrease();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(1));
    }
    @Test
    public void whenJobDescByPriorityDecrease() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityDecrease();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(2));
    }
    @Test
    public void whenJobDescByPriorityIncrease() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityIncrease();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }
}
