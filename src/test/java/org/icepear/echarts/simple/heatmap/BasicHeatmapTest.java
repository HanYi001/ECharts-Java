package org.icepear.echarts.simple.heatmap;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.Heatmap;
import org.icepear.echarts.charts.heatmap.HeatmapSeries;
import org.icepear.echarts.components.coord.SplitArea;
import org.icepear.echarts.components.coord.cartesian.CategoryAxis;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.serializer.EChartsSerializer;
import org.junit.Test;

public class BasicHeatmapTest {
    @Test
    public void testBasicHeatmap() {
        Heatmap heatmap = new Heatmap()
                .addXAxis(new CategoryAxis()
                        .setData(new String[] { "12a", "1a", "2a", "3a", "4a", "5a", "6a", "7a", "8a", "9a", "10a",
                                "11a", "12p", "1p", "2p", "3p", "4p", "5p", "6p", "7p", "8p", "9p", "10p", "11p" })
                        .setSplitArea(new SplitArea().setShow(true)))
                .addYAxis(new CategoryAxis()
                        .setData(new String[] { "Saturday", "Friday", "Thursday", "Wednesday", "Tuesday", "Monday",
                                "Sunday" })
                        .setSplitArea(new SplitArea().setShow(true)))
                .setVisualMap(0, 10)
                .addSeries(new HeatmapSeries().setName("Punch Card")
                        .setData(new Object[][] { { 0, 0, 5 }, { 1, 0, 1 }, { 2, 0, null }, { 3, 0, null },
                                { 4, 0, null }, { 5, 0, null }, { 6, 0, null }, { 7, 0, null }, { 8, 0, null },
                                { 9, 0, null }, { 10, 0, null }, { 11, 0, 2 }, { 12, 0, 4 }, { 13, 0, 1 }, { 14, 0, 1 },
                                { 15, 0, 3 }, { 16, 0, 4 }, { 17, 0, 6 }, { 18, 0, 4 }, { 19, 0, 4 }, { 20, 0, 3 },
                                { 21, 0, 3 }, { 22, 0, 2 }, { 23, 0, 5 }, { 0, 1, 7 }, { 1, 1, null }, { 2, 1, null },
                                { 3, 1, null }, { 4, 1, null }, { 5, 1, null }, { 6, 1, null }, { 7, 1, null },
                                { 8, 1, null }, { 9, 1, null }, { 10, 1, 5 }, { 11, 1, 2 }, { 12, 1, 2 }, { 13, 1, 6 },
                                { 14, 1, 9 }, { 15, 1, 11 }, { 16, 1, 6 }, { 17, 1, 7 }, { 18, 1, 8 }, { 19, 1, 12 },
                                { 20, 1, 5 }, { 21, 1, 5 }, { 22, 1, 7 }, { 23, 1, 2 }, { 0, 2, 1 }, { 1, 2, 1 },
                                { 2, 2, null }, { 3, 2, null }, { 4, 2, null }, { 5, 2, null }, { 6, 2, null },
                                { 7, 2, null }, { 8, 2, null }, { 9, 2, null }, { 10, 2, 3 }, { 11, 2, 2 },
                                { 12, 2, 1 }, { 13, 2, 9 }, { 14, 2, 8 }, { 15, 2, 10 }, { 16, 2, 6 }, { 17, 2, 5 },
                                { 18, 2, 5 }, { 19, 2, 5 }, { 20, 2, 7 }, { 21, 2, 4 }, { 22, 2, 2 }, { 23, 2, 4 },
                                { 0, 3, 7 }, { 1, 3, 3 }, { 2, 3, null }, { 3, 3, null }, { 4, 3, null },
                                { 5, 3, null }, { 6, 3, null }, { 7, 3, null }, { 8, 3, 1 }, { 9, 3, null },
                                { 10, 3, 5 }, { 11, 3, 4 }, { 12, 3, 7 }, { 13, 3, 14 }, { 14, 3, 13 }, { 15, 3, 12 },
                                { 16, 3, 9 }, { 17, 3, 5 }, { 18, 3, 5 }, { 19, 3, 10 }, { 20, 3, 6 }, { 21, 3, 4 },
                                { 22, 3, 4 }, { 23, 3, 1 }, { 0, 4, 1 }, { 1, 4, 3 }, { 2, 4, null }, { 3, 4, null },
                                { 4, 4, null }, { 5, 4, 1 }, { 6, 4, null }, { 7, 4, null }, { 8, 4, null },
                                { 9, 4, 2 }, { 10, 4, 4 }, { 11, 4, 4 }, { 12, 4, 2 }, { 13, 4, 4 }, { 14, 4, 4 },
                                { 15, 4, 14 }, { 16, 4, 12 }, { 17, 4, 1 }, { 18, 4, 8 }, { 19, 4, 5 }, { 20, 4, 3 },
                                { 21, 4, 7 }, { 22, 4, 3 }, { 23, 4, null }, { 0, 5, 2 }, { 1, 5, 1 }, { 2, 5, null },
                                { 3, 5, 3 }, { 4, 5, null }, { 5, 5, null }, { 6, 5, null }, { 7, 5, null },
                                { 8, 5, 2 }, { 9, 5, null }, { 10, 5, 4 }, { 11, 5, 1 }, { 12, 5, 5 }, { 13, 5, 10 },
                                { 14, 5, 5 }, { 15, 5, 7 }, { 16, 5, 11 }, { 17, 5, 6 }, { 18, 5, null }, { 19, 5, 5 },
                                { 20, 5, 3 }, { 21, 5, 4 }, { 22, 5, 2 }, { 23, 5, null }, { 0, 6, 1 }, { 1, 6, null },
                                { 2, 6, null }, { 3, 6, null }, { 4, 6, null }, { 5, 6, null }, { 6, 6, null },
                                { 7, 6, null }, { 8, 6, null }, { 9, 6, null }, { 10, 6, 1 }, { 11, 6, null },
                                { 12, 6, 2 }, { 13, 6, 1 }, { 14, 6, 3 }, { 15, 6, 4 }, { 16, 6, null },
                                { 17, 6, null }, { 18, 6, null }, { 19, 6, null }, { 20, 6, 1 }, { 21, 6, 2 },
                                { 22, 6, 2 }, { 23, 6, 6 } })
                        .setLabel(new SeriesLabel().setShow(true)));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/simple/heatmap/basic-heatmap.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartsSerializer.toJsonTree(heatmap.getOption());
        assertEquals(expected, actual);

        // System.out.println(EChartsSerializer.toJson(heatmap.getOption()));
    }
}
