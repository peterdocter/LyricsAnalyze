package com.happy.lyrics.test;

import java.io.File;

import com.happy.lyrics.LyricsFileReader;
import com.happy.lyrics.LyricsFileWriter;
import com.happy.lyrics.model.LyricsInfo;
import com.happy.lyrics.utils.LyricsIOUtils;

/**
 * 测试
 * 
 * @author zhangliangming
 * 
 */
public class Test {

	public static void main(String[] args) throws Exception {

		File lyricsfile = new File(
				"haplayer/lyrics/ทุกเช้า ทุกคืน ทุกวัน - โอ๊ค สมิทธิ์.krc");
		LyricsFileReader lyricsFileReader = LyricsIOUtils
				.getLyricsFileReader(lyricsfile);
		LyricsInfo lyricsInfo = lyricsFileReader.readFile(lyricsfile);

		// for (int i = 0; i < lyricsInfo.getLyricsLineInfoTreeMap().size();
		// i++) {
		// System.out.println(lyricsInfo.getLyricsLineInfoTreeMap().get(i)
		// .getLineLyrics());
		// }
		File saveLyricsfile = new File(
				"haplayer/lyrics/ทุกเช้า ทุกคืน ทุกวัน - โอ๊ค สมิทธิ์.hrcs");
		LyricsFileWriter lyricsFileWriter = LyricsIOUtils
				.getLyricsFileWriter(saveLyricsfile);

		lyricsFileWriter.writer(lyricsInfo, saveLyricsfile.getPath());

		// 测试韩语
		// File lyricsfile = new
		// File("haplayer/lyrics/允儿 - When The Wind Blows (바람이 불면).hrc");
		// LyricsFileReader lyricsFileReader = LyricsIOUtils
		// .getLyricsFileReader(lyricsfile);
		// LyricsInfo lyricsInfo = lyricsFileReader.readFile(lyricsfile);
		// File saveLyricsfile = new
		// File("haplayer/lyrics/允儿 - When The Wind Blows (바람이 불면).hrc");
		// LyricsFileWriter lyricsFileWriter =
		// LyricsIOUtils.getLyricsFileWriter(saveLyricsfile);
		//
		// lyricsFileWriter.writer(lyricsInfo, saveLyricsfile.getPath());

		// 测试韩语
		// File lyricsfile = new File(
		// "haplayer/lyrics/ทุกเช้า ทุกคืน ทุกวัน - โอ๊ค สมิทธิ์.krc");
		// LyricsFileReader lyricsFileReader = LyricsIOUtils
		// .getLyricsFileReader(lyricsfile);
		// LyricsInfo lyricsInfo = lyricsFileReader.readFile(lyricsfile);
	}

}
