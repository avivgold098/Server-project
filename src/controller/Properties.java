package controller;

import java.io.Serializable;

/**
 * In this class we have all the properties for algos using for generate or the solve methods.
 * also in this class we are set the number of threads into the model.
 * It is very useful because now we don't need every compilation update our source code. Now we have only
 * to update our properties and reads them from xml file.
 * @author HP
 *
 */
public class Properties implements Serializable{
	private static final long serialVersionUID = 42L;
	/**
	 * port for connection
	 */
	int port;
	/**
	 * number of threads into model
	 */
	int numberOfThreads;
	/**
	 * algo for sol aster or bds
	 */
	String algorithemForSolution;
	/**
	 * algo for generate the maze prim or simple
	 */
	String algorithemForGenerate;
	
/**
 * Default ctor of our class that initialize our date members.
 */
	public Properties() {
		this.port = 5400;
		this.numberOfThreads = 10;
		this.algorithemForSolution = "A* Air Distance";
		this.algorithemForGenerate = "My Maze generator";
	}
	/**
	 * this method is returning the algo name we using for generate the maze
	 * @return String the algo name for generate
	 */
	public String getAlgorithemForGenerate() {
		return algorithemForGenerate;
	}

	/**
	 * in this method we are setting the algo name for generate the maze
	 * @param algorithemForCreate -String name the algo name that copied.
	 */

	public void setAlgorithemForGenerate(String algorithemForGenerate) {
		this.algorithemForGenerate = algorithemForGenerate;
	}

	/**
	 * in this method we return the bumber of the thread into the model.(the max number).
	 * @return int the max num of threads.
	 */
	public int getNumberOfThreads() {
		return numberOfThreads;
	}

	/**
	 * in this method we are setting the max number of threads that can running into the model
	 * @param int the max number of threads that copied for our date member.
	 */

	public void setNumberOfThreads(int numberOfThreads) {
		this.numberOfThreads = numberOfThreads;
	}


	/**
	 * this method is returning the algo name we using for solve the maze
	 * @return String the algo name for solve our maze.
	 */
	public String getAlgorithemForSolution() {
		return algorithemForSolution;
	}
	/**
	 * in this method we are setting the algo name for soul of the the maze
	 * @param algorithemForSolution -String name the soul name that copied.
	 */

	public void setAlgorithemForSolution(String algorithemForSolution) {
		this.algorithemForSolution = algorithemForSolution;
	}
	
	/**
	 * in this method we are returning the num of port that server work with him.
	 * @return our number of port.
	 */
	public int getPort() {
		return port;
	}
	
	/**
	 * in this method we are setting a new number of port to work with him.
	 * @param port - the other port for working with him.
	 */
	public void setPort(int port) {
		this.port = port;
	}
}