package ro.ulbs.paradigme.Laborator10.dataprocessing.impl;

import ro.ulbs.paradigme.Laborator10.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.Laborator10.storage.DataRepository;
import ro.ulbs.paradigme.Laborator10.storage.SensorData;

import java.util.List;

public class FilteredStepCountStrategy implements StepCountStrategy {

    private final DataRepository repository = DataRepository.getInstance();

    @Override
    public void consumeMessage(SensorData sample) {
        repository.addData(sample);
    }

    @Override
    public int getTotalSteps() {
        List<SensorData> data = repository.getRecords();
        int totalSteps = 0;

        for (int i = 0; i < data.size(); i++) {
            SensorData current = data.get(i);
            if (current.getStepsCount() <= 0) continue;

            long currentTime = current.getTimestamp();
            int stepsInLastMinute = 0;

            for (int j = 0; j < data.size(); j++) {
                SensorData other = data.get(j);
                if (other.getTimestamp() >= currentTime - 60_000 && other.getTimestamp() <= currentTime) {
                    stepsInLastMinute += other.getStepsCount();
                }
            }

            if (stepsInLastMinute <= 1000) {
                totalSteps += current.getStepsCount();
            }
        }

        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "Filtered strategy: only positive steps with no more than 1000 in the last minute.";
    }
}
