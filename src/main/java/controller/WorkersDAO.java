package controller;

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

    public List<Worker> findById (List<Worker> data, long id) {
        return data.stream()
                .filter(work -> work.getId() == id)
                .collect(Collectors.toList());
    }

    public void updateWorker (int id, Worker workerNew) {
        Worker workerOld = data.stream()
                .filter(work -> work.getId() == id)
                .findFirst().get();
        System.out.println("updateWorkerDAO " + workerOld + " " + workerNew);
        Collections.replaceAll(data, workerOld, workerNew);
    }

    public void deleteWorker (long id) {
        List<Worker> foundedWorker = data.stream()
                .filter(work -> work.getId() == id)
                .collect(Collectors.toList());

      //  System.out.println("Delete " + foundedWorker.toString());
        /*System.out.println("Delete worker: " + worker.toString());
        System.out.println("Delete worker id: " + worker.getId());*/

        data.removeAll(foundedWorker);
    }

    public int getSize() {
        return data.size();
    }

    public List<Worker> getWorkers () {
        return data;
    }

    public Worker getWorkerById (long id) {
        return data.stream()
               .filter(work -> work.getId() == id)
               .findFirst().get();
    }

    public void removeAll () {
        data = new ArrayList<>();
    }
}
