package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    public final double avgTemp;
    public final double devTemp;
    public final double minTemp;
    public final double maxTemp;

    public TempSummaryStatistics(double avgTemp, double devTemp,
                                 double minTemp, double maxTemp) {
        this.avgTemp = avgTemp;
        this.devTemp = devTemp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

}