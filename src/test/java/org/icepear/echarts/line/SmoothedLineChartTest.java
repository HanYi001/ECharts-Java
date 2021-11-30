package org.icepear.echarts.line;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.LineSeries;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.Axis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class SmoothedLineChartTest {
    @Test
    public void testSmoothedLineChart() {
        Axis xAxis = new Axis()
                .setAxisBaseOption(new CategoryAxis()
                        .setType("category")
                        .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")));

        Axis yAxis = new Axis()
                .setAxisBaseOption(new ValueAxis()
                        .setType("value"));

        LineSeries series = new LineSeries()
                .setData(Arrays.asList(820, 932, 901, 934, 1290, 1330, 1320))
                .setType("line")
                .setSmooth(true);

        Option option = new Option()
                .setXAxis(xAxis)
                .setYAxis(yAxis)
                .setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/line/smoothed-line-chart.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}
