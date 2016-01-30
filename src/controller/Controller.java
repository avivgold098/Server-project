package controller;

import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;
import algorithms.search.Solution;
import model.Model;
import server.Server;

/**
 * It is the inter face of the controller in the mvc.
 * the controller role in the mvc is passing things from the view to the model for solve the problem
 * and then return the soul to the controller that pass the soul to the view.
 * @author HP
 *
 */
public interface Controller {
	/**
	 * in this method the controller return the model that he works with him
	 * @return the data member model of the controller.
	 */
	Model getModel();
	
	/**
	 * in this method the controller return the Server that he works with him
	 * @return the data member Server of the controller.
	 */
	Server getServer();
	
	/**
	 * in this method the controller is passing the message to the view
	 * and then in the view we showing the message.
	 * @param massage - the massage to passing into the view.
	 */
	void setMessage(String massage);
	
	/**
	 * this method in the controller is method of create 3d maze.
	 * in this method we making a local 3dMaze and then call to generate into the model.
	 *  after the generate method we end we return the local variable to the view.
	 * @param parm - the maze name
	 * @return the maze we create 
	 */
	Maze3d getMaze(String parm);
	
	/**
	 * this method in the controller is method of create soul for our search problem.
	 * in this method we making a local soul and then call to generate into the model.
	 *  after the generate method  end we return the local variable to the view.
	 *  in this method we are passing name of the maze to the model and then waiting for sol.
	 * @param parm - the maze name
	 * @return the sol we created in the model method of solve. 
	 */
	Solution<Position> getSolution(String parm);
	
	/**
	 * this method in the controller is method of create soul for our search problem.
	 * in this method we making a local soul and then call to generate into the model.
	 *  after the generate method  end we return the local variable to the view.
	 * @param maze- the maze that we want for him the sol.
	 * @return the sol we created in the model method of solve. 
	 */
	Solution<Position> getSolution(Maze3d maze);
	/**
	 * in this method we exit the server side by calling the method of exit into the model.
	 * that doing a safe exit.
	 */
	void exit();
	/**
	 * in this method we close the server side by calling the method of close into the model.
	 */
	void close();

	/**
	 * this method is pasued our server and we success we return true other wise f.
	 * @return boolean true for success otherwise fallse.
	 * 
	 */
	boolean pause();

	/**
	 * resume the server
	 *  * @return boolean true for success otherwise fallse.
	 */
	boolean resume();
}