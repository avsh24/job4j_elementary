package ru.job4j.encapsulation.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void findItemAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2");
        tracker.add(item);
        Item[] result = tracker.findAll();
        assertThat(tracker.findAll(), is(result));
    }

    @Test
    public void findItemByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test3");
        tracker.add(item);
        Item[] result = tracker.findByName(item.getName());
        assertThat(tracker.findByName(item.getName()), is(result));
    }

    @Test
    public void findItemById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test4");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(tracker.findById(item.getId()), is(result));
    }
}
