package net.clanwolf.c3.starmap;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

import java.math.BigDecimal;

public class StarSystem {

	private String name;
	private BigDecimal x;
	private BigDecimal y;
	private String affiliation;

	private Circle starSystemCircle;
	private Label starSystemLabel;
	private StackPane starSystemStackPane;
	private Group starSystemGroup;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScreenX() {
		double screenX = x.doubleValue() * 5;
		screenX = 3000 + screenX;
		return screenX;
	}

	public double getScreenY() {
		double screenY = y.doubleValue() * 5;
		screenY = 6000 - (3000 + screenY);
		return screenY;
	}

	public double getX() {
		return x.doubleValue();
	}

	public void setX(BigDecimal x) {
		this.x = x;
	}

	public double getY() {
		return y.doubleValue();
	}

	public void setY(BigDecimal y) {
		this.y = y;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	@SuppressWarnings("unused")
	public Circle getStarSystemCircle() {
		return starSystemCircle;
	}

	public void setStarSystemCircle(Circle starSystemCircle) {
		this.starSystemCircle = starSystemCircle;
	}

	public Label getStarSystemLabel() {
		return starSystemLabel;
	}

	public void setStarSystemLabel(Label starSystemLabel) {
		this.starSystemLabel = starSystemLabel;
	}

	public Group getStarSystemGroup() {
		return starSystemGroup;
	}

	public void setStarSystemGroup(Group starSystemGroup) {
		this.starSystemGroup = starSystemGroup;
	}

	public StackPane getStarSystemStackPane() {
		return starSystemStackPane;
	}

	public void setStarSystemStackPane(StackPane starSystemStackPane) {
		this.starSystemStackPane = starSystemStackPane;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
