package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class TemperatureSeriesAnalysisTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyTemp() {
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis();

        // expect exception here
        double actualResult = seriesAnalysis.average();
    }

    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysisOneEl = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysisOneEl.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.average();
    }

    @Test
    public void testAverage() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.average();
        
        assertEquals(expResult, actualResult, 0.00001);        
    }


    @Test
    public void testDeviation() {
        double[] temperatureSeries = {3.0, 2.0, 4.0, 1.0, 5.0, 6.0, 7.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 2.0;

        double actualResult = seriesAnalysis.deviation();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.deviation();
    }

    @Test
    public void testDeviationWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysisOneEl = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;

        // call tested method
        double actualResult = seriesAnalysisOneEl.deviation();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMinWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysisOneEl = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysisOneEl.min();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.min();
    }

    @Test
    public void testMin() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -5.0;

        double actualResult = seriesAnalysis.min();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMaxWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysisOneEl = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysisOneEl.max();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.max();
    }

    @Test
    public void testMax() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;

        double actualResult = seriesAnalysis.max();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testClosestValueWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysisOneEl = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysisOneEl.closestValue();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.min();
    }

    @Test
    public void testFindTempClosestToValueWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysisOneEl = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysisOneEl.findTempClosestToValue(2.3);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.findTempClosestToValue(2.3);
    }

    @Test
    public void testClosestValue() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.0;

        double actualResult = seriesAnalysis.findTempClosestToValue(4.3);

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToZeroWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysisOneEl = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysisOneEl.findTempClosestToZero();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.findTempClosestToZero();
    }


    @Test
    public void testFindTempClosestToZero() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        double actualResult = seriesAnalysis.findTempClosestToZero();

        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempLessThenWithOneElementArray() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysisOneEl = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = {-1.0};

        // call tested method
        double actualResult = seriesAnalysisOneEl.findTempLessThen(0.0);

        // compare expected result with actual result
        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult), 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempLessThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.findTempLessThen();
    }

    @Test
    public void testFindTempLessThen() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {-5.0};

        double[] actualResult = seriesAnalysis.findTempsLessThen(1.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));
    }

    @Test
    public void testFindTempGreaterThenWithOneElementArray() {
        double[] temperatureSeries = {1.0};
        TemperatureSeriesAnalysis seriesAnalysisOneEl = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = {1.0};

        // call tested method
        double actualResult = seriesAnalysisOneEl.findTempGreaterThen(0.0);

        // compare expected result with actual result
        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult), 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTempGreaterThenWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.findTempGreaterThen();
    }

    @Test
    public void testFindTempGreaterThen() {
        double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {3.0, 5.0};

        double[] actualResult = seriesAnalysis.findTempsGreaterThen(1.0);

        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));
    }

    @Test
    public void testSummuryStatisticsWithOneElementArray() {
        double expAvg = -1.0;
        double expDev = 0.0;
        double expMin = -1.0;
        double expMax = -1.0;

        TempSummaryStatistics statistics = seriesAnalysisOneEl.summaryStatistics();

        assertEquals(statistics.avgTemp, expAvg, 0.00001);
        assertEquals(statistics.devTemp, expDev, 0.00001);
        assertEquals(statistics.minTemp, expMin, 0.00001);
        assertEquals(statistics.maxTemp, expMax, 0.00001);
    }

    @Test
    public void testSummuryStatisticsWithOneElementArray() {
        double expAvg = -1.0;
        double expDev = 0.0;
        double expMin = -1.0;
        double expMax = -1.0;

        TempSummaryStatistics statistics = seriesAnalysisOneEl.summaryStatistics();

        assertEquals(statistics.avgTemp, expAvg, 0.00001);
        assertEquals(statistics.devTemp, expDev, 0.00001);
        assertEquals(statistics.minTemp, expMin, 0.00001);
        assertEquals(statistics.maxTemp, expMax, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSummaryStatisticsWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysisEmpty.summaryStatistics();
    }

    @Test
    public void testSummaryStatistics() {

        double expAvg = 1.0;
        double expDev = Math.sqrt(14.0);
        double expMin = -5.0;
        double expMax = 5.0;

        TempSummaryStatistics statistics = seriesAnalysisManyEl.summaryStatistics();

        assertEquals(statistics.avgTemp, expAvg, 0.00001);
        assertEquals(statistics.devTemp, expDev, 0.00001);
        assertEquals(statistics.minTemp, expMin, 0.00001);
        assertEquals(statistics.maxTemp, expMax, 0.00001);
    }

    @Test
    public void testAddTempsWithOneElementArray() {
        double[] temperatureSeries = {1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] temperatureAddSeries = {2.0, 3.0};
        double expResult = 3;

        // call tested method
        seriesAnalysisOneEl.addTemps(temperatureAddSeries)
        double actualResult = seriesAnalysisOneEl.addTemps(temperatureAddSeries);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testAddTempsWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysisEmpty = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] temperatureAddSeries = {2.0, 3.0};
        double expResult = 2;

        // call tested method
        seriesAnalysisOneEl.addTemps(temperatureAddSeries)
        double actualResult = seriesAnalysisOneEl.addTemps(temperatureAddSeries);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);

    }

    @Test
    public void testAddTemps() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0, 1.0, 3.7};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis();
        double[] temperatureSeries = {-1.0, 5.0};

        double expResult = 5;

        // call tested method
        double actualResult = seriesAnalysis.addTemps(temperatureSeries);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }
}
