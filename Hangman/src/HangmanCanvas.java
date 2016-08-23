/*
 * File: HangmanCanvas.java
 * ------------------------
 * This file keeps track of the Hangman display.
 */

import acm.graphics.*;

public class HangmanCanvas extends GCanvas {
	
/** Resets the display so that only the scaffold appears */
	public void reset(String label) {
		removeAll();
		wordStatus = new GLabel(label);
		add(wordStatus, wordStatusX, wordStatusY);
		drawScaffold();
		lettersGuessed = "";
		badGuesses = new GLabel(lettersGuessed);
		add(badGuesses, wordStatusX, wordStatusY + 30);
	}
	
/** Updates the word on the screen to correspond to the current
 * state of the game. The argument string shows what letters have
 * been guessed so far; unguessed letters are indicated by hyphens.
 */
	public void displayWord(String word) {
		wordStatus.setLabel(word);
	}
	
/** 
 * Updates the display to correspond to an incorrect guess by the
 * user. Calling this method causes the next body part to appear
 * on the scaffold and adds the letter to the list of incorrect
 * guesses that appears at the bottom of the window.
 */
	public void noteIncorrectGuess(char letter, int guesses) {
		//guesses++;
		lettersGuessed += letter;
		badGuesses.setLabel(lettersGuessed);
		switch(guesses) {
		case 7: drawHead(); break;
		case 6: drawBody(); break;
		case 5: drawLeftArm(); break;
		case 4: drawRightArm(); break;
		case 3: drawLeftLeg(); break;
		case 2: drawRightLeg(); break;
		case 1: drawLeftFoot(); break;
		default: drawRightFoot(); break;
		};
	}
	
/* Draws initial scaffold */
	private void drawScaffold() {
		GLine scaffold = new GLine(scaffoldX, scaffoldY, scaffoldX, scaffoldY + SCAFFOLD_HEIGHT);
		add(scaffold);
		GLine beam = new GLine(scaffoldX, scaffoldY, scaffoldX + BEAM_LENGTH, scaffoldY);
		add(beam);
		GLine rope = new GLine(scaffoldX + BEAM_LENGTH, scaffoldY, scaffoldX + BEAM_LENGTH, scaffoldY + ROPE_LENGTH);
		add(rope);
	}
	
	private void drawHead() {
		GOval head = new GOval(HEAD_RADIUS * 2, HEAD_RADIUS * 2);
		add(head, scaffoldX + BEAM_LENGTH - HEAD_RADIUS, scaffoldY + ROPE_LENGTH);
	}
	
	private void drawBody() {
		GLine body = new GLine(scaffoldX + BEAM_LENGTH, scaffoldY + ROPE_LENGTH + HEAD_RADIUS * 2, scaffoldX + BEAM_LENGTH, scaffoldY + ROPE_LENGTH * 2 + HEAD_RADIUS * 2 + BODY_LENGTH);
		add(body);
	}
	
	private void drawLeftArm() {
		GLine upperArm = new GLine(scaffoldX + (BEAM_LENGTH - UPPER_ARM_LENGTH), scaffoldY + ROPE_LENGTH + HEAD_RADIUS * 2 + ARM_OFFSET_FROM_HEAD, scaffoldX + BEAM_LENGTH, scaffoldY + ROPE_LENGTH + HEAD_RADIUS * 2 + ARM_OFFSET_FROM_HEAD);
		add(upperArm);
		GLine lowerArm = new GLine(scaffoldX + (BEAM_LENGTH - UPPER_ARM_LENGTH), scaffoldY + ROPE_LENGTH + HEAD_RADIUS * 2 + ARM_OFFSET_FROM_HEAD, scaffoldX + (BEAM_LENGTH - UPPER_ARM_LENGTH), scaffoldY + ROPE_LENGTH + HEAD_RADIUS * 2 + ARM_OFFSET_FROM_HEAD + LOWER_ARM_LENGTH);
		add(lowerArm);
	}
	
	private void drawRightArm() {
		GLine upperArm = new GLine(scaffoldX + BEAM_LENGTH, scaffoldY + ROPE_LENGTH + HEAD_RADIUS * 2 + ARM_OFFSET_FROM_HEAD, scaffoldX + BEAM_LENGTH + UPPER_ARM_LENGTH, scaffoldY + ROPE_LENGTH + HEAD_RADIUS * 2 + ARM_OFFSET_FROM_HEAD);
		add(upperArm);
		GLine lowerArm = new GLine(scaffoldX + BEAM_LENGTH + UPPER_ARM_LENGTH, scaffoldY + ROPE_LENGTH + HEAD_RADIUS * 2 + ARM_OFFSET_FROM_HEAD, scaffoldX + BEAM_LENGTH + UPPER_ARM_LENGTH, scaffoldY + ROPE_LENGTH + HEAD_RADIUS * 2 + ARM_OFFSET_FROM_HEAD + LOWER_ARM_LENGTH);
		add(lowerArm);
	}
	
	private void drawLeftLeg() {
		GLine upperLeg = new GLine(scaffoldX + BEAM_LENGTH - HIP_WIDTH, scaffoldY + SCAFFOLD_HEIGHT - LEG_LENGTH, scaffoldX + BEAM_LENGTH, scaffoldY + SCAFFOLD_HEIGHT - LEG_LENGTH);
		add(upperLeg);
		GLine lowerLeg = new GLine(scaffoldX + BEAM_LENGTH - HIP_WIDTH, scaffoldY + SCAFFOLD_HEIGHT - LEG_LENGTH, scaffoldX + BEAM_LENGTH - HIP_WIDTH, scaffoldY + SCAFFOLD_HEIGHT - FOOT_FROM_GROUND);
		add(lowerLeg);
	}
	
	private void drawRightLeg() {
		GLine upperLeg = new GLine(scaffoldX + BEAM_LENGTH, scaffoldY + SCAFFOLD_HEIGHT - LEG_LENGTH, scaffoldX + BEAM_LENGTH + HIP_WIDTH, scaffoldY + SCAFFOLD_HEIGHT - LEG_LENGTH);
		add(upperLeg);
		GLine lowerLeg = new GLine(scaffoldX + BEAM_LENGTH + HIP_WIDTH, scaffoldY + SCAFFOLD_HEIGHT - LEG_LENGTH, scaffoldX + BEAM_LENGTH + HIP_WIDTH, scaffoldY + SCAFFOLD_HEIGHT - FOOT_FROM_GROUND);
		add(lowerLeg);
	}
	
	private void drawLeftFoot() {
		GLine foot = new GLine(scaffoldX + BEAM_LENGTH - HIP_WIDTH - FOOT_LENGTH, scaffoldY + SCAFFOLD_HEIGHT - FOOT_FROM_GROUND, scaffoldX + BEAM_LENGTH - HIP_WIDTH, scaffoldY + SCAFFOLD_HEIGHT - FOOT_FROM_GROUND);
		add(foot);
	}
	
	private void drawRightFoot() {
		GLine foot = new GLine(scaffoldX + BEAM_LENGTH + HIP_WIDTH, scaffoldY + SCAFFOLD_HEIGHT - FOOT_FROM_GROUND, scaffoldX + BEAM_LENGTH + HIP_WIDTH + FOOT_LENGTH, scaffoldY + SCAFFOLD_HEIGHT - FOOT_FROM_GROUND);
		add(foot);
	}
	
/* Constants for the simple version of the picture (in pixels) */
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;
	private static final int FOOT_FROM_GROUND = 18;
	
/* Instance variables */
	private int wordStatusX = 75;
	private int wordStatusY = 450;
	private int scaffoldX = 50;
	private int scaffoldY = 20;
	private GLabel wordStatus;
	//private int guesses = 0;
	private GLabel badGuesses;
	private String lettersGuessed;
}
