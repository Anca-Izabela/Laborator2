package ro.ulbs.paradigme.Laborator10.storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Persists sensor data.
 */
public class DataRepository {


    private static final DataRepository instance = new DataRepository();


    private final List<SensorData> dataRecords = new ArrayList<>();


    private DataRepository() {
    }


    public static DataRepository getInstance() {
        return instance;
    }


    public void addData(SensorData dataRecord){
        dataRecords.add(dataRecord);
    }


    public List<SensorData> getRecords() {
        return new ArrayList<>(dataRecords);
    }
}
