package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

public class Controls {
	
	
	@FXML
	TextField text;
	
	double firstNum;
	double secondNum;
	String operator;
	double answer;
	boolean answerFound;
	boolean firstNumFound;

	private boolean answerOnScreen;

	private boolean secondNumFound;
	
	
	
	@FXML
	public void adding() {
		operatorHandling("+");
	}
	
	
	
	@FXML
	public void sub() {
		operatorHandling("-");
	}
	
	@FXML
	public void div() {
		operatorHandling("/");
	}
	
	@FXML
	public void mult() {
		operatorHandling("x");
	}
	
	@FXML
	public void one() {
		digitHandling("1");
	}
	
	@FXML
	public void two() {
		digitHandling("2");
	}
	
	@FXML
	public void three() {
		digitHandling("3");
	}
	
	@FXML
	public void four() {
		digitHandling("4");
	}
	
	@FXML
	public void five() {
		digitHandling("5");
	}
	
	@FXML
	public void six() {
		digitHandling("6");
	}
	
	@FXML
	public void seven() {
		digitHandling("7");
		
	}
	
	@FXML
	public void eight() {
		digitHandling("8");
	}
	
	@FXML
	public void nine() {
		digitHandling("9");
		
	}
	
	@FXML
	public void zero() {
		digitHandling("0");
		
	}
	
	@FXML
	public void decimal() {
		if (!text.getText().contains(".")) {
			digitHandling(".");
			
		}
	}
	
	@FXML
	public void AC() {
		text.clear();
		firstNum = 0;
		secondNum = 0;
		operator = "";
		answer = 0;
		answerFound = false;
		firstNumFound = false;
	}
	
	@FXML
	public void equals() {
		secondNum = Double.parseDouble(text.getText());
		secondNumFound = true;
		switch(operator) {
			case "+" -> answer = firstNum + secondNum;
			case "-" -> answer = firstNum - secondNum;
			case "x" -> answer = firstNum * secondNum;
			case "/" -> answer = firstNum / secondNum;
		}
		
		
		text.setText(String.valueOf(answer));
		firstNum = answer;
		System.out.println("firstNum: "+ firstNum);
		System.out.println("secondNum: " + secondNum);
		
	}
	
	
	public void digitHandling(String buttonTyped) {
		if ("x+-/".contains(text.getText()) || answerOnScreen) {
			text.clear();
			answerOnScreen = false;
		}
		
		
		
		
		String value = text.getText();
		text.setText(value + buttonTyped);

		System.out.println("firstNum: "+ firstNum);
		System.out.println("secondNum: " + secondNum);
	}
	
	public void operatorHandling(String operandUsed) {
		System.out.println("firstNum: "+ firstNum);
		System.out.println("secondNum: " + secondNum);
	
		if ("x+-/".contains(text.getText())) {
			text.clear();
			
		}
		/*if (firstNumFound && secondNumFound) {
			
		}
		if(firstNumFound) {
			
			switch(operandUsed) {
			case "/" -> answer = firstNum / Double.parseDouble(text.getText());
			case "x" -> answer = firstNum * Double.parseDouble(text.getText());
			case "+" -> answer = firstNum + Double.parseDouble(text.getText());
			case "-" -> answer = firstNum - Double.parseDouble(text.getText());
			}
			text.clear();
			text.setText(String.valueOf(answer));
			answerOnScreen = true;
			
		}
		
		else {
			
		}*/
		
		firstNum = Double.parseDouble(text.getText());
		text.clear();
		text.setText(String.valueOf(operandUsed));
		operator = operandUsed;
	}
	
	
	public void quadrticFormula() {
		
	}

}
