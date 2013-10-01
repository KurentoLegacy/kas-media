/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */

package com.kurento.kas.media.tx;

import com.kurento.kas.media.profiles.VideoProfile;

/**
 * This class represents all needed information to encode and mux video frames.
 */
public class VideoInfoTx {

	private VideoProfile videoProfile;
	private int payloadType;
	private String out;

	public VideoProfile getVideoProfile() {
		return videoProfile;
	}

	public void setVideoProfile(VideoProfile videoProfile) {
		this.videoProfile = videoProfile;
	}

	public int getPayloadType() {
		return payloadType;
	}

	public void setPayloadType(int payloadType) {
		this.payloadType = payloadType;
	}

	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}

	public VideoInfoTx(VideoProfile videoProfile) {
		this.videoProfile = videoProfile;
	}

}
