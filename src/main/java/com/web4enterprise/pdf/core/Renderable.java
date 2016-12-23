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
package com.web4enterprise.pdf.core;

import com.web4enterprise.pdf.core.geometry.Rect;


public interface Renderable {
	/**
	 * Set link to another Renderable.
	 * 
	 * @param link The Renderable to link to.
	 */
	void setLink(Renderable link);
	
	/**
	 * Get link to another Renderable.
	 * 
	 * @return The linked Renderable.
	 */
	Renderable getLink();
	
	/**
	 * Set the page where this Linkable is positioned to.
	 */
	void setPage(int pageId);
	
	/**
	 * Get the page where this Linkable is positioned to.
	 * 
	 * @return The page id.
	 */
	int getPage();
	
	/**
	 * Get X position of this linkable.
	 * 0.0f means no change in current position.
	 * 
	 * @return The X position.
	 */
	float getLinkX();
	
	/**
	 * Get Y position of this linkable.
	 * 0.0f means no change in current position.
	 * 
	 * @return The Y position.
	 */
	float getLinkY();
	
	/**
	 * Get zoom of this linkable.
	 * 0.0f means no change in current zoom.
	 * 
	 * @return The zoom.
	 */
	default float getLinkZ() {
		return 0.0f;
	}
	
	/**
	 * Get the bounding box of renderable.
	 * 
	 * @return The bounding box.
	 */
	Rect getBoundingBox();
	
	/**
	 * Render object in PDF format. 
	 */
	void render(StringBuilder builder);
}