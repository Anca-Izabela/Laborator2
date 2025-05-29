package ro.ulbs.paradigme.Laborator10.main;

import ro.ulbs.paradigme.Laborator10.storage.DataRepository;
import ro.ulbs.paradigme.Laborator10.storage.DataAggregator;
import ro.ulbs.paradigme.Laborator10.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.Laborator10.dataprocessing.impl.BasicStepCountStrategy;
import ro.ulbs.paradigme.Laborator10.dataprocessing.impl.FilteredStepCountStrategy;
import ro.ulbs.paradigme.Laborator10.storage.SensorData;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Choose a strategy: type 'basic' or 'filtered'");
        Scanner scanner = new Scanner(System.in);
        String strategyType = scanner.next();
        scanner.close();

        // Obține instanța singleton DataRepository
        DataRepository dataRepository = DataRepository.getInstance();

        // Creează strategia în funcție de input
        StepCountStrategy strategy;
        if ("basic".equalsIgnoreCase(strategyType)) {
            strategy = new BasicStepCountStrategy();
        } else if ("filtered".equalsIgnoreCase(strategyType)) {
            strategy = new FilteredStepCountStrategy();
        } else {
            System.out.println("Unknown strategy type");
            return;
        }

        // Creează agregatorul cu strategia aleasă
        DataAggregator aggregator = new DataAggregator(strategy);

        // Populează repository-ul cu date de test
        long baseTimestamp = System.currentTimeMillis();

        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        dataRepository.addData(new SensorData(500, baseTimestamp + 600));

        // Rulează procesarea și afișează rezultatele
        System.out.println("====================================================");
        aggregator.receive(dataRepository);
        System.out.println(aggregator.getResults());
        System.out.println("====================================================");
    }
}
