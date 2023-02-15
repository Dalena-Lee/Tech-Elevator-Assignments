package com.techelevator.QuizMaker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuizMaker {
	private File inputFile;
	private List<QuizQuestions> questions;
	private String score;

	public QuizMaker(File inputFile) {
		this.inputFile = inputFile;
		questions = new ArrayList<>();
	}

	public void calculateScore(int scoreCorrect, int numOfQuestions) {
		this.score = scoreCorrect + "/" + numOfQuestions;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public void addQuestion(QuizQuestions newQuestion) {
		questions.add(newQuestion);
	}

	public File getInputFile() {
		return inputFile;
	}

	public void setInputFile(File inputFile) {
		this.inputFile = inputFile;
	}

	public List<QuizQuestions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuizQuestions> questions) {
		this.questions = questions;
	}

	public static void main(String[] args) throws IOException {
		Scanner userInput = new Scanner(System.in);
		int countLines = 0;
		String question = "";
		int score = 0;

		System.out.println("Please enter a path to input file: ");
		System.out.print("Path: ");
		String path = userInput.nextLine();
		File inputFile = new File(path);

		while (inputFile.exists() == false || inputFile.isFile() == false) {
			try {
				if (inputFile.exists() == false) {
					throw new FileNotFoundException(path + " does not exist.");
				} else if (inputFile.isFile() == false) {
					throw new IOException(path + " is not a file.");
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("Please enter path to a valid file.");
				System.out.print("Path: ");
				path = userInput.nextLine();
				inputFile = new File(path);
			}
		}

		countLines = (int) Files.lines(Path.of(path)).parallel().count();
		QuizMaker quiz;
		QuizQuestions[] quizQuestion = new QuizQuestions[countLines];
		quiz = new QuizMaker(inputFile);

		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				List<String> answers = new ArrayList<>();
				String eachLine = fileScanner.nextLine();
				int index = 0;

				String[] arr = eachLine.split("\\|");
				question = arr[0];
				quizQuestion[index] = new QuizQuestions(question, answers);
				quiz.addQuestion(quizQuestion[index]);

				for (int i = 1; i < arr.length; i++) {
					answers.add(arr[i]);

					Pattern p = Pattern.compile("[\\*]", Pattern.CASE_INSENSITIVE);
					Matcher m = p.matcher(arr[i]);
					boolean b = m.find();

					if (b) {
						quizQuestion[index].setCorrectAnswer(arr[i]);
					}
				}

				List<String> ans = quizQuestion[index].getAnswers();
				int count = 0;

				System.out.println(quizQuestion[index].getQuestion());

				for (String s : ans) {
					count++;
					s = s.replaceAll("\\*", "");
					System.out.println(count + ". " + s);
				}

				System.out.print("Answer: ");
				String input = userInput.nextLine();
				while (!input.matches(".*\\d.*")) {
					try {
						if (!input.matches(".*\\d.*")) {
							throw new IllegalArgumentException("Please enter a number.");
						}

					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					} finally {
						input = userInput.nextLine();
					}
				}

				String userAnswer = ans.get(Integer.parseInt(input) - 1);
				userAnswer = userAnswer.replaceAll("\\*", "");
				String correctAnswer = quizQuestion[index].getCorrectAnswer();

				if (userAnswer.equals(correctAnswer)) {
					System.out.println("Your answer: " + userAnswer.replaceAll("\\*", ""));
					System.out.println("That's correct!");
					score++;
					quiz.calculateScore(score, countLines);
					System.out.println("Your score is: " + quiz.getScore());
					System.out.println("");
				} else {
					System.out.println("Your answer: " + userAnswer.replaceAll("\\*", ""));
					System.out.println("That's incorrect.");
					System.out.println("The correct answer is: " + correctAnswer);
					quiz.calculateScore(score, countLines);
					System.out.println("Your score is: " + quiz.getScore());
					System.out.println("");
				}
				index++;
			}

			double scoreAsNum = ((double) score / (double) countLines) * 100;
			System.out.println("You've completed the quiz. Your total score is " + quiz.getScore() + " or " + (int) scoreAsNum + "%.");

			if ((int)scoreAsNum < 50) {
				System.out.println("Wow... Try studying a little harder.");
			}
		}
	}
}


