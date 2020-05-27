package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.encapsulation.tracker.Item;
import ru.job4j.encapsulation.tracker.ItemComparatorDec;
import ru.job4j.encapsulation.tracker.ItemComparatorInc;
import ru.job4j.encapsulation.tracker.Tracker;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemComparatorTest {
    @Test
    public void thenItemComparatorInc() {
        Tracker tracker = new Tracker();
        Item item3 = new Item("Item3");
        Item item1 = new Item("Item1");
        Item item2 = new Item("Item2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.findAll().sort(new ItemComparatorInc());
        assertThat(tracker.findAll(), is(Arrays.asList(item1, item2, item3)));
    }

    @Test
    public void thenItemComparatorDec() {
        Tracker tracker = new Tracker();
        Item item3 = new Item("Item3");
        Item item1 = new Item("Item1");
        Item item2 = new Item("Item2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.findAll().sort(new ItemComparatorDec());
        assertThat(tracker.findAll(), is(Arrays.asList(item3, item2, item1)));
    }
}
