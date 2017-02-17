package prac1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Mosic1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub

		BorderPane lw = leftWindow();
		GridPane chess = chessBoard();
		GridPane middleBox = middlesquare();
		GridPane littleBoxes = theeLittleBoxs();
		GridPane mw = middleWindow();
		GridPane rw = rightWindow();
		BorderPane midWindow = topMidBorder(middleBox);
		BorderPane rightBot = rightBotWindow(littleBoxes);
		

		mw.add(midWindow, 0, 0);
		rw.add(rightBot, 0, 2);
		mw.add(chess, 0, 1);

		HBox hb = new HBox();
		hb.getChildren().add(lw);
		hb.getChildren().add(mw);
		hb.getChildren().add(rw);
		HBox.setHgrow(mw, Priority.ALWAYS);
		HBox.setHgrow(rw, Priority.ALWAYS);
		HBox.setHgrow(lw, Priority.ALWAYS);
		hb.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		//

		Scene s = new Scene(hb, 300, 300);
		primaryStage.setScene(s);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////
	public BorderPane leftWindow() {

		BorderPane lw = new BorderPane();
		Label x;
		lw.setTop(x = new Label(""));
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefHeight(10);

		lw.setRight(x = new Label(""));
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.HOTPINK, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefWidth(10);

		lw.setBottom(x = new Label(""));
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefHeight(10);

		lw.setLeft(x = new Label(""));
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.GREY, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefWidth(10);

		lw.setCenter(x = new Label(""));
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.AQUA, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefHeight(100);

		return lw;

	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public GridPane middleWindow() {
		GridPane mw = new GridPane();

		for (int c = 0; c < 1; c++)
			for (int r = 0; r < 2; r++) {

				Pane mp = new Pane();
				mw.add(mp, 0, 0);

				mp.setBackground(
						new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));

				GridPane.setHgrow(mp, Priority.ALWAYS);
				GridPane.setVgrow(mp, Priority.ALWAYS);
				mp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

			}
		return mw;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public GridPane rightWindow() {
		GridPane rw = new GridPane();

		for (int c1 = 0; c1 < 1; c1++)
			for (int r1 = 0; r1 < 3; r1++) {

				Pane l1 = new Pane();
				Pane l2 = new Pane();
				Pane l3 = new Pane();
				l1.setBackground(new Background(new BackgroundFill(Color.BLUE, new CornerRadii(0), new Insets(0))));
				;
				l2.setBackground(new Background(new BackgroundFill(Color.PINK, new CornerRadii(0), new Insets(0))));
				l3.setBackground(new Background(new BackgroundFill(Color.GRAY, new CornerRadii(0), new Insets(0))));
				rw.add(l1, 0, 0);
				rw.add(l2, 0, 1);
				rw.add(l3, 0, 2);

				GridPane.setHgrow(l1, Priority.ALWAYS);
				GridPane.setVgrow(l1, Priority.ALWAYS);
				l1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

				GridPane.setHgrow(l2, Priority.ALWAYS);
				GridPane.setVgrow(l2, Priority.ALWAYS);
				l1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

				GridPane.setHgrow(l3, Priority.ALWAYS);
				GridPane.setVgrow(l3, Priority.ALWAYS);
				l3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

				GridPane.setHgrow(rw, Priority.ALWAYS);
				GridPane.setVgrow(rw, Priority.ALWAYS);
				rw.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			}
		return rw;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public GridPane chessBoard() {
		GridPane checker = new GridPane();

		for (int r1 = 1; r1 < 9; r1++)
			for (int c1 = 0; c1 < 8; c1++) {
				Label b = new Label();
				if ((c1 + r1) % 2 == 0) {

					b.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(0), new Insets(0))));
					checker.add(b, c1, r1);
				} else {
					b.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(0), new Insets(0))));
					checker.add(b, c1, r1);
				}

				GridPane.setHgrow(b, Priority.ALWAYS);
				GridPane.setVgrow(b, Priority.ALWAYS);
				b.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				checker.setAlignment(Pos.CENTER);
				checker.setPrefHeight(100);
			}
		GridPane.setHgrow(checker, Priority.ALWAYS);
		GridPane.setVgrow(checker, Priority.ALWAYS);
		checker.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		return checker;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public GridPane middlesquare() {
		GridPane squareGrid = new GridPane();

		for (int col1 = 0; col1 < 2; col1++)
			for (int row1 = 0; row1 < 2; row1++) {

				Label b1 = new Label("");
				Label b2 = new Label("");
				Label b3 = new Label("");
				Label b4 = new Label("");

				b1.setBackground(new Background(new BackgroundFill(Color.PINK, new CornerRadii(0), new Insets(0))));
				;
				b2.setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(0), new Insets(0))));
				;
				b3.setBackground(new Background(new BackgroundFill(Color.PINK, new CornerRadii(0), new Insets(0))));
				;
				b4.setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(0), new Insets(0))));
				;

				squareGrid.add(b1, 0, 0);
				squareGrid.add(b2, 1, 0);
				squareGrid.add(b3, 1, 1);
				squareGrid.add(b4, 0, 1);

				squareGrid.setAlignment(Pos.CENTER);
				squareGrid.setPrefHeight(50);
				

				GridPane.setHgrow(b1, Priority.ALWAYS);
				GridPane.setVgrow(b1, Priority.ALWAYS);
				b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				GridPane.setHgrow(b2, Priority.ALWAYS);
				GridPane.setVgrow(b2, Priority.ALWAYS);
				b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				GridPane.setHgrow(b3, Priority.ALWAYS);
				GridPane.setVgrow(b3, Priority.ALWAYS);
				b3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				GridPane.setHgrow(b4, Priority.ALWAYS);
				GridPane.setVgrow(b4, Priority.ALWAYS);
				b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			}
		GridPane.setHgrow(squareGrid, Priority.ALWAYS);
		GridPane.setVgrow(squareGrid, Priority.ALWAYS);
		squareGrid.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		return squareGrid;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public GridPane theeLittleBoxs() {
		GridPane blw = new GridPane();

		for (int c11 = 0; c11 < 3; c11++)
			for (int r11 = 0; r11 < 1; r11++) {
				Label box1 = new Label("");
				Label box2 = new Label("");
				Label box3 = new Label("");

				box1.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(0))));
				;
				box2.setBackground(new Background(new BackgroundFill(Color.ORANGE, new CornerRadii(0), new Insets(0))));
				;
				box3.setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(0), new Insets(0))));
				;
			
				blw.add(box1, 0, 0);
				blw.add(box2, 1, 0);
				blw.add(box3, 2, 0);
				blw.setMaxHeight(10);

				GridPane.setHgrow(box1, Priority.ALWAYS);
				GridPane.setVgrow(box1, Priority.ALWAYS);
				box1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

				GridPane.setHgrow(box2, Priority.ALWAYS);
				GridPane.setVgrow(box2, Priority.ALWAYS);
				box2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

				GridPane.setHgrow(box3, Priority.ALWAYS);
				GridPane.setVgrow(box3, Priority.ALWAYS);
				box3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			}
		blw.setPadding(new Insets(10));
		blw.setHgap(5);
		blw.setAlignment(Pos.TOP_CENTER);

		return blw;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public BorderPane topMidBorder(GridPane midPane) {

		BorderPane MidBorder = new BorderPane();
		Label x;
		MidBorder.setTop(x = new Label(""));
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefHeight(45);

		MidBorder.setRight(x = new Label(""));
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefWidth(25);

		MidBorder.setBottom(x = new Label(""));
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefHeight(45);

		MidBorder.setLeft(x = new Label(""));
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefWidth(25);

		MidBorder.setCenter(midPane);

		return MidBorder;
	}
	
	public BorderPane rightBotWindow(GridPane p){
		BorderPane rightBorder = new BorderPane();
		rightBorder.setTop(p);

	return rightBorder;	
	}
}
