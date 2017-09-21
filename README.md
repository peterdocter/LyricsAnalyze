# 更新日志 #
- 2017-09-20：因为读取歌词的时候，将歌词格式编码都设置为utf-8,所以解析之前的歌词时，会造成乱码问题，到时有乱码，只要将utf-8编码修改一下即可。

- 2017-09-19：根据krc歌词，研究和生成hrcs歌词(hrcx歌词升级版)，完美支持krc歌词的转换
- 2017-09-19：添加解析krc的音译歌词和翻译歌词

- 2017-09-19：krc歌词转hrcx歌词，暂时只支持解析中文、英文、韩文和日文歌词的转换

# 歌词解析器

乐乐第一个版本，使用的是KSC卡拉OK的歌词格式，该歌词格式，虽然可以实现动态歌词的效果， 解析也方便，但是该歌词文件的大小差不多是酷狗krc文件的两倍多，所以在存储时还是占用了比较大的空间。

# hrc (happy lyrics)歌词

乐乐第二个版本，使用自定义的歌词格式文件hrc (happy lyrics) 。 该版本可自制歌词并生成hrc歌词，它与酷狗krc比较，感觉还是不错的，占空间小了好多。

# hrcx (happy lyrics)歌词
hrc的简化和优化
# android版本播放器 #
链接：https://github.com/zhangliangming/HappyPlayer5.git
# PC版本播放器 #
链接：https://github.com/zhangliangming/HappyPlayer-PC.git