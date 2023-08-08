package src.game;

import javax.swing.*;
import java.awt.*;

public class CustomIcon {
    private String defaultIconPath;
    private String flippedIconPath;
    private Boolean isDone;
    private Boolean isFlipped;
    private ImageIcon defaultIconImage;
    private ImageIcon flippedIconImage;

    public CustomIcon(String flippedIconPath) {
        this.defaultIconPath = "/";
        this.flippedIconPath = flippedIconPath;
        this.isDone = false;
        this.isFlipped = false;

        this.defaultIconImage = new ImageIcon(this.defaultIconPath);
        Image oldDefaultIconImage = this.defaultIconImage.getImage();
        Image updatedDefaultIconImage = oldDefaultIconImage.getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        this.defaultIconImage = new ImageIcon(updatedDefaultIconImage);

        this.flippedIconImage = new ImageIcon(this.flippedIconPath);
        Image oldFlippedIconImage = this.flippedIconImage.getImage();
        Image updatedFlippedIconImage = oldFlippedIconImage.getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        this.flippedIconImage = new ImageIcon(updatedFlippedIconImage);
    }

    public String getDefaultIconPath() {
        return defaultIconPath;
    }

    public void setDefaultIconPath(String defaultIconPath) {
        this.defaultIconPath = defaultIconPath;
    }

    public String getFlippedIconPath() {
        return flippedIconPath;
    }

    public void setFlippedIconPath(String flippedIconPath) {
        this.flippedIconPath = flippedIconPath;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        this.isDone = done;
    }

    public Boolean getFlipped() {
        return isFlipped;
    }

    public void setFlipped(Boolean flipped) {
        isFlipped = flipped;
    }

    public ImageIcon getDefaultIconImage() {
        return defaultIconImage;
    }

    public void setDefaultIconImage(ImageIcon defaultIconImage) {
        this.defaultIconImage = defaultIconImage;
    }

    public ImageIcon getFlippedIconImage() {
        return flippedIconImage;
    }

    public void setFlippedIconImage(ImageIcon flippedIconImage) {
        this.flippedIconImage = flippedIconImage;
    }
}
