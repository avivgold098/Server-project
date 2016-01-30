package model;

import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;
import algorithms.search.Solution;
import controller.Controller;

/**
 * It is the interface class in the mvc of the server side project.
 * the model role in the mvc its to creating sol for some problems that sent from the controller
 * and then returning the sol.
 * So after the model end to create or solve we he should , he sents that to the controller.
 * @author HP
 *
 */
public interface Model {

	/**
	 * In this method we create for our search problem.
	 * In this method we can to create two type of sol one with bfs and another with astar.
	 * @param name - the name of the maze with the search problem.
	 * @return the sol of for maze name we sent in the parm.
	 */
	Solution<Position> solve(String name);
	/**
	 * In this method we create for our search problem.
	 * In this method we can to create two type of sol one with bfs and another with astar.
	 * @param maze -  the maze with the search problem.
	 * @return the sol of the maze we sent in the parm.
	 */
	Solution<Position> solve(Maze3d maze);
	
	/**
	 * this method is generate  a new maze with specific name and limits.
	 * we can choose or simple or prim algo for generate.
	 * @param name - the name of the new maze
	 * @param x - every floor length
	 * @param y - the number of flooes
	 * @param z - the the every floor width.
	 */
	Maze3d generate3dMaze(String str);
	
	/**
	 * This method is exit from all the server side and also shut down the thread pool using safe
	 * exit and save the files.
	 */
	void exit();

	/**
	 * set the controller that the model work with him
	 * @param controller - the other controller that copied for our data member.
	 */
	void setController(Controller controller);

	/**
	 * in this method we save the hash map of sol and also the hash map of maze and his name into zip file.
	 */
	void save();

	/**
	 * in this method we load the hash map of sol and also the hash map of maze and his name into zip file.
	 */
	void load();

	/**
	 * In this method we pause the the threads into the server and
	 * return true for success other wise we return false.
	 */
	boolean pause();

	/**
	 * In this method we resume the the threads into the server and
	 * return true for success other wise we return false.
	 */
	boolean resume();
}