package org.example.rpg1_0;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class displayValue {
    private int maxValue;
    private int currentValue;
    private int percentile;

    public displayValue(int maxValue, int currentValue) {
        this.maxValue = maxValue;
        this.currentValue = currentValue;
        this.percentile = (int) Math.ceil((double) currentValue / maxValue);
        updatePercentile();
    }
    private void updatePercentile() {
        this.percentile = (int) Math.ceil((double) currentValue / maxValue);
    }
    public BorderPane getDisplay() {
        BorderPane display = new BorderPane();
        Text total = new Text(currentValue + "/" + maxValue);
        Rectangle max = new Rectangle(100, 10, Color.GRAY);
        Rectangle current = new Rectangle(this.percentile, 10, Color.GRAY);
        StackPane stack = new StackPane(current, max);
        display.setCenter(stack);
        display.setTop(total);
        total.setTextAlignment(TextAlignment.LEFT);
        return display;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
        updatePercentile();
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
        updatePercentile();
    }
}
