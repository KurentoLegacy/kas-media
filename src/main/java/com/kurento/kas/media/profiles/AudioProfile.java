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

package com.kurento.kas.media.profiles;

import com.kurento.kas.media.codecs.AudioCodecType;

public enum AudioProfile {
	AMR(AudioCodecType.AMR, AudioCodecType.AMR.getSupportedBitRate(),
			AudioCodecType.AMR.getSupportedSampleRate(), "amr bit_rate=12200"),
	MP2(AudioCodecType.MP2, AudioCodecType.MP2.getSupportedBitRate(),
			AudioCodecType.MP2.getSupportedSampleRate(), "mp2 bit_rate=64000"),
	AAC(AudioCodecType.AAC, AudioCodecType.AAC.getSupportedBitRate(),
			AudioCodecType.AAC.getSupportedSampleRate(), "aac bit_rate=64000"),
	PCMU(AudioCodecType.PCMU, AudioCodecType.PCMU.getSupportedBitRate(),
			AudioCodecType.PCMU.getSupportedSampleRate(), "pcmu bit_rate=64000"),
	PCMA(AudioCodecType.PCMA, AudioCodecType.PCMA.getSupportedBitRate(),
			AudioCodecType.PCMA.getSupportedSampleRate(), "pcma bit_rate=64000");

	private AudioCodecType audioCodecType;
	private int bitRate;
	private int sampleRate;
	private String description;

	public AudioCodecType getAudioCodecType() {
		return audioCodecType;
	}

	public int getBitRate() {
		return bitRate;
	}

	public int getSampleRate() {
		return sampleRate;
	}

	public String getDescription() {
		return description;
	}

	private AudioProfile(AudioCodecType audioCodecType, int bitRate,
			int sampleRate, String description) {
		this.audioCodecType = audioCodecType;
		this.bitRate = bitRate;
		this.sampleRate = sampleRate;
		this.description = description;
	}

	public static AudioProfile getAudioProfileFromAudioCodecType(
			AudioCodecType audioCodecType) {
		if (AMR.audioCodecType.equals(audioCodecType))
			return AMR;
		if (MP2.audioCodecType.equals(audioCodecType))
			return MP2;
		if (AAC.audioCodecType.equals(audioCodecType))
			return AAC;
		if (PCMU.audioCodecType.equals(audioCodecType))
			return PCMU;
		if (PCMA.audioCodecType.equals(audioCodecType))
			return PCMA;

		return null;
	}
}
