package org.Seminar.Sem_7.AdapterMeteo;

import java.time.LocalDateTime;

public class ST500ToMS200Adapter implements MeteoSensor {
    private SensorTemperature st;

    public ST500ToMS200Adapter(SensorTemperature st) {
        this.st = st;
    }

    @Override
    public int getId() {
        return st.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)st.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime timestamp = LocalDateTime.of(st.year(), 7, 18, 0,0,0 );
        timestamp.plusDays(st.day()).plusSeconds(st.second());
        return timestamp;
    }
}
