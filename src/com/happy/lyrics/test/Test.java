package com.happy.lyrics.test;

import java.io.File;

import com.happy.lyrics.LyricsFileReader;
import com.happy.lyrics.model.LyricsInfo;
import com.happy.lyrics.utils.LyricsIOUtils;

/**
 * 暂时支持
 * @author zhangliangming
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		// 测试日语
		// File lyricsfile = new File("haplayer/lyrics/茶太 - 志在千里~恋姫喚作百花王~.hrc");
		// LyricsFileReader lyricsFileReader = LyricsIOUtils
		// .getLyricsFileReader(lyricsfile);
		// LyricsInfo lyricsInfo = lyricsFileReader.readFile(lyricsfile);
		// File saveLyricsfile = new
		// File("haplayer/lyrics/茶太 - 志在千里~恋姫喚作百花王~.hrc");
		// LyricsFileWriter lyricsFileWriter =
		// LyricsIOUtils.getLyricsFileWriter(saveLyricsfile);
		//
		// lyricsFileWriter.writer(lyricsInfo, saveLyricsfile.getPath());

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
		File lyricsfile = new File("haplayer/lyrics/ทุกเช้า ทุกคืน ทุกวัน - โอ๊ค สมิทธิ์.krc");
		LyricsFileReader lyricsFileReader = LyricsIOUtils
				.getLyricsFileReader(lyricsfile);
		LyricsInfo lyricsInfo = lyricsFileReader.readFile(lyricsfile);
	}

}
