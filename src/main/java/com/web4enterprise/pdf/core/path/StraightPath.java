/*
 * Copyright 2016 web4enterprise.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.web4enterprise.pdf.core.path;

import java.util.Arrays;
import java.util.List;

import com.web4enterprise.pdf.core.geometry.Point;
import com.web4enterprise.pdf.core.styling.Color;

/**
 * Class representing a straight path to render in a PDF document.
 * 
 * @author Régis Ramillien
 */
public class StraightPath extends Path {
	/**
	 * The list points in the straight path.
	 */
	protected List<Point> points;
	
	/**
	 * Creates a straight path from points.
	 * 
	 * @param startPoint The first point in path.
	 * @param points The other points in path.
	 */
	public StraightPath(Point startPoint, Point... points) {
		super(startPoint);
		
		this.points = Arrays.asList(points);
	}
	
	/**
	 * Creates a straight path from points.
	 * 
	 * @param lineWidth The width of line to create.
	 * @param strokeColor The stroke color of line.
	 * @param startPoint The first point in path.
	 * @param points The other points in path.
	 */
	public StraightPath(float lineWidth, Color strokeColor, Point startPoint, Point... points) {
		super(startPoint);
		
		this.lineWidth = lineWidth;
		this.strokeColor = strokeColor;
		this.points = Arrays.asList(points);
	}

	/**
	 * Get the points of path.
	 * 
	 * @return The points.
	 */
	public List<Point> getPoints() {
		return points;
	}
}
