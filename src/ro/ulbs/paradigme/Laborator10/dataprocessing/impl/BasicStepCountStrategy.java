package ro.ulbs.paradigme.Laborator10.dataprocessing.impl;

import ro.ulbs.paradigme.Laborator10.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.Laborator10.storage.DataRepository;
import ro.ulbs.paradigme.Laborator10.storage.SensorData;

public class BasicStepCountStrategy implements StepCountStrategy {

    private final DataRepository repository = DataRepository.getInstance();

    @Override
    public void consumeMessage(SensorData sample) {
        repository.addData(sample);
    }

    @Override
    public int getTotalSteps() {
        return repository.getRecords()
                .stream()
                .mapToInt(SensorData::getStepsCount)
                .sum();
    }

    @Override
    public String getStrategyDescription() {
        return "Basic strategy: sums all available step counts.";
    }
}
