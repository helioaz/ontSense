///
/// This file is part of OntCog project ( https://github.com/helioaz/ontSense )
/// 
/// OntCog is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by
/// the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
/// 
/// OntCog is distributed in the hope that it will be useful,  but WITHOUT ANY WARRANTY; without even the implied warranty of
/// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.See the GNU General Public License for more details.
/// 
/// 
/// You should have received a copy of the GNU General Public License  along with Foobar. 
/// If not, see<http://www.gnu.org/licenses/>.
/// 
///

package br.usp.ontSenseJavaAPI;

/**
 * A machine that resembles a living creature in being capable of moving independently and performing complex actions.
 */
public class Robot extends Thing {


	/**
	 * Default constructor for the Robot class. 
	 */

	public Robot()
	{
	}


	/**
	 * Constructor for the Robot class. The objective is to create a instance of a robot. 
	 * All  parameters together defines this robot.
	 * 
	 *  
	 */
	public Robot(long objId, String name, String tag, RGBValue colorObj, CartesianPos posObj, PhysicalState phyState, Material mat, String uri) {
        	super(objId, name, tag, colorObj, posObj, phyState, mat, uri);

	}



}
