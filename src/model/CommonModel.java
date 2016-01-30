package model;

import java.util.HashMap;

import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;
import algorithms.search.Solution;
import controller.Controller;
/**
 * In this class is we have all the common things for the all models.
 * so in this class we the data members thats we to share in every model we create.
 * @author HP
 *
 */
public abstract class CommonModel implements Model{
	/**
	 * in this hash map we are mapping between string to maze3d
	 */
	HashMap<String, Maze3d> hm;
	/**
	 * in this hash map we are mapping between maze3d to sol.
	 */
	HashMap<Maze3d, Solution<Position>> hashSolution;
	/**
	 * the ctor of our class that initialize our data members.
	 */
	public CommonModel() {
		hm = new HashMap<String,Maze3d>();
		hashSolution = new HashMap<Maze3d, Solution<Position>>();
	}
	
	@Override
	public abstract Maze3d generate3dMaze(String str);
		
	@Override
	public abstract Solution<Position> solve(String name);
	
	@Override
	public abstract Solution<Position> solve(Maze3d maze);

	@Override
	public abstract void exit();
	
	@Override
	public abstract void setController(Controller controller);

	@Override
	public abstract void save();
	
	@Override
	public abstract void load();

	@Override
	public abstract boolean pause();

	@Override
	public abstract boolean resume();
}