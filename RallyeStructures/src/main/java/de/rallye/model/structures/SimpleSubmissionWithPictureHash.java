/*
 * Copyright (c) 2014 Jakob Wenzel, Ramon Wirsch.
 *
 * This file is part of RallyeSoft.
 *
 * RallyeSoft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RallyeSoft. If not, see <http://www.gnu.org/licenses/>.
 */

package de.rallye.model.structures;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Ramon on 08.10.13
 */
public class SimpleSubmissionWithPictureHash extends SimpleSubmission {

	public static final String PICTURE_HASH = "pictureHash";

	public final String pictureHash;

	public SimpleSubmissionWithPictureHash(@JsonProperty("submitType") int submitType, @JsonProperty("textSubmission") String textSubmission, @JsonProperty("pictureHash") String pictureHash) {
		super(submitType, null, textSubmission);

		this.pictureHash = pictureHash;
	}
}
