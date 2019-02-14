package subject;

import listeners.MyListener;

import java.util.ArrayList;
import java.util.List;

public class MySubject {

    private List<MyListener> listeners = new ArrayList<>();

    public void addMyListener(MyListener listener) {
        listeners.add(listener);
    }

    private void notifyAllListeners() {
        listeners.parallelStream().forEach(MyListener::smthHappened);
    }

    public void action() {
        // other stuff
        notifyAllListeners();
    }

}
