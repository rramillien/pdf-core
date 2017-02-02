/*
 * Copyright 2017 web4enterprise.
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
package com.web4enterprise.pdf.core.link;

/**
 * Defines a link destination.
 * 
 * @author Régis Ramillien
 */
public interface Linkable {	
	/**
	 * Get the page where this Linkable is positioned to.
	 * 
	 * @return The page id.
	 */
	Integer getPage();
	
	/**
	 * Get X position of this linkable.
	 * 0.0f means no change in current position.
	 * 
	 * @return The X position.
	 */
	Float getLinkX();
	
	/**
	 * Get Y position of this linkable.
	 * 0.0f means no change in current position.
	 * 
	 * @return The Y position.
	 */
	Float getLinkY();
}
