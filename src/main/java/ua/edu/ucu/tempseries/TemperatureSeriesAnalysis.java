package ua.edu.ucu.tempseries;

import java.util.Arrays;
import java.util.InputMismatchException;

public class TemperatureSeriesAnalysis {
    private double[] temperatures;

    public TemperatureSeriesAnalysis() {
        this.temperatures = new double[0];
    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        checkMinTemp(temperatureSeries);
        temperatures = Arrays.stream(temperatureSeries).sorted().toArray();
    }

    public double average() {
        checkEmpty();
        double sum = 0;
        for (double temp: temperatures) {
            sum += temp;
        }
        return sum/temperatures.length;
    }

    public double deviation() {
        checkEmpty();
        double mean = average();
        double dev = 0;
        for (double temp: temperatures) {
            dev += Math.pow(mean - temp, 2);
        }
        dev /= temperatures.length;
        dev = Math.sqrt(dev);
        return dev;
    }

    public double min() {
        checkEmpty();
        return temperatures[0];
    }

    public double max() {
        checkEmpty();
        return temperatures[temperatures.length-1];
    }

    public double findTempClosestToZero() {
        return findTempClosestToValue(0);
    }

    public double findTempClosestToValue(double tempValue) {
        checkEmpty();
        double closestDistance = 600;
        double closestValue = 0;
        for (double temp: temperatures) {
            double check = Math.abs(temp - tempValue);
            if (check < closestDistance) {
                closestDistance = check;
                closestValue = temp;
            }
        }
        return closestValue;
    }

    public double[] findTempsLessThen(double tempValue) {
        checkEmpty();
        int size = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < tempValue){
                size = i+1;
            }
        }
        double[] result = new double[size];
        for (int j = 0; j < size; j++) {
            result[j] = temperatures[j];
        }
        return result;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        checkEmpty();
        int i = 0;
        while (temperatures[i] < tempValue) { i++; }
        if (temperatures[i] == tempValue) {
            i++;
        }
        double[] result = new double[temperatures.length - i];
        for (int j = i; j < temperatures.length; j++) {
            result[j-i] = temperatures[j];
        }
        return result;
    }

    public TempSummaryStatistics summaryStatistics() {
        return new TempSummaryStatistics(average(), deviation(), min(), max());
    }

    public int addTemps(double... temps) {
        checkMinTemp(temps);
        int arr1Size = temps.length;
        int arr2Size = temperatures.length;
        double[] tempArr = new double[arr1Size + arr2Size];
        System.arraycopy(temps, 0, tempArr, 0, arr1Size);
        System.arraycopy(temperatures, 0, tempArr, arr1Size, arr2Size);
        temperatures = Arrays.stream(tempArr).sorted().toArray();
        return temperatures.length;
    }

    private void checkEmpty() {
        if (temperatures.length == 0) {
            throw new IllegalArgumentException();
        }
    }

    private void checkMinTemp(double[] temps) {
        for (double temp: temps) {
            if (temp < -273) {
                throw new InputMismatchException();
            }
        }
    }
}
