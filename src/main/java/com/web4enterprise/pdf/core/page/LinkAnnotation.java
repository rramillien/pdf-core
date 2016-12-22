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
package com.web4enterprise.pdf.core.page;

import com.web4enterprise.pdf.core.geometry.Rect;

/**
 * Defines a link annotation as expected in PDF format.
 * 
 * @author Régis Ramillien
 */
public class LinkAnnotation {
	protected int destinationPage;
	protected float destinationX;
	protected float destinationY;
	protected float destinationZ;
	
	protected Rect sourceRect;
	
	public LinkAnnotation(int destinationPage, float destinationX, float destinationY, float destinationZ, Rect sourceRect) {
		this.destinationPage = destinationPage;
		this.destinationX = destinationX;
		this.destinationY = destinationY;
		this.destinationZ = destinationZ;
		this.sourceRect = sourceRect;
	}

	public int getDestinationPage() {
		return destinationPage;
	}

	public float getDestinationX() {
		return destinationX;
	}

	public float getDestinationY() {
		return destinationY;
	}

	public float getDestinationZ() {
		return destinationZ;
	}

	public Rect getSourceRect() {
		return sourceRect;
	}
}