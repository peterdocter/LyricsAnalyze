package com.happy.lyrics.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.codec.binary.Base64;

import com.happy.lyrics.LyricsFileReader;
import com.happy.lyrics.utils.LyricsIOUtils;

public class Test {

	public static void main(String[] args) throws Exception {
		File lyricsfile = new File("haplayer/lyrics/李健 - 美若黎明.krc");
		FileInputStream in = new FileInputStream(lyricsfile);
		byte[] fileContent = new byte[in.available()];
		in.read(fileContent);
		in.close();

		String base64FileContentString = Base64.encodeBase64String(fileContent);
		LyricsFileReader lyricsFileReader = LyricsIOUtils
				.getLyricsFileReader(lyricsfile);
		lyricsFileReader.readLrcText(base64FileContentString, null);
	}

}
