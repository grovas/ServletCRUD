package controller;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import model.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WorkersDAO {

    private static List<Worker> data = new ArrayList<>();
    private static Worker worker;

    public void insertWorker (Worker worker) {
        data.add(worker);
    }

    public Worker findById (List<Worker> data, int id) {
        return data.stream()
                .filter(work -> work.getId() == id)
                .findFirst().get();
    }

    public void updateWorker (int id, Worker workerNew) {
        Worker workerOld = findById(data, id);
        Collections.replaceAll(data, workerOld, workerNew);
    }

    public void deleteWorker (long id) {
        List<Worker> foundedWorker = data.stream()
                .filter(work -> work.getId() == id)
                .collect(Collectors.toList());

        data.removeAll(foundedWorker);
    }

    public int getSize() {
        return data.size();
    }

    public List<Worker> getWorkers () {
        return data;
    }

    public Worker getWorkerById (int id) {
        return findById(data, id);
    }

    /*public void removeAll () {
        data = new ArrayList<>();
    }*/
}
