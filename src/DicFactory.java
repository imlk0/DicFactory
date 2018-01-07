import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DicFactory {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
	     * 很久很久以前 巨龙突然出现 带来灾难 带走了公主又消失不见 王国十分危险 世间谁最勇敢 一位勇者赶来大声喊 「我要带上最好的剑 翻过最高的山 闯进最深的森林 把公主带回到面前」 国王非常高兴忙问他的姓名 年轻人想了想 他说 「陛下我叫龘䶛䨻㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁） 再说一次 龘䶛䨻䆉㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁）」 「是不是 龘䶛䨻㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁）」 「对对 龘䶛䨻䆉㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁）」 英雄龘䶛䨻䆉（达拉崩吧） 骑上最快的马 带著大家的希望从城堡里出发 战争怪兽来袭 获得十二金币 无数伤痕见证他慢慢升级 偏远美丽村庄打开所有宝箱 一路风霜伴随指引前路的圣月光 闯入一座山洞 公主和可怕巨龙 英雄拔出宝剑 巨龙说 「我是㱎䖘䵈䶁䘔䶑䘓铽䩳䵷㒪䪉䉥（昆图库踏克替考特苏哇席拉松） 再来一次 㱎䖘䵈䶁䘔䶑䘓铽䩳䵷㒪䪉䉥（昆图库踏克替考特苏哇席拉松）」 「是不是 昆特牌提琴 烤蛋挞 苏打 马拉松」 「不对 㱎䖘䵈䶁䘔䶑䘓铽䩳䵷㒪䪉䉥（昆图库踏克替考特苏哇席拉松）」 於是 龘䶛䨻㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁） 砍向 㱎䖘䵈䶁䘔䶑䘓铽䩳䵷㒪䪉䉥（昆图库踏克替考特苏哇席拉松） 然后 㱎䖘䵈䶁䘔䶑䘓铽䩳䵷㒪䪉䉥（昆图库踏克替考特苏哇席拉松） 咬了 龘䶛䨻䆉㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁） 最后 龘䶛䨻䆉㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁） 他战胜了 㱎䖘䵈䶁䘔䶑䘓铽䩳䵷㒪䪉䉥（昆图库踏克替考特苏哇席拉松） 救出了 公主䥸䝟䳮䟑䎘䫱䉷䰯䕈䟐䬝（迷牙莫拉素拉戴利谢利翁） 回到了 䥰龘䰕䘋㽌䇁䵄䵻䬛蟿䆉㖀城（蒙他卢科柳司朵库毕庆把拉多城） 国王听说 龘䶛䨻䆉㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁） 他打败了 㱎䖘䵈䶁䘔䶑䘓铽䩳䵷㒪䪉䉥（昆图库踏克替考特苏哇席拉松） 就把 公主䥸䝟䳮䟑䎘䫱䉷䰯䕈䟐䬝（米雅莫拉素拉戴利谢利翁） 嫁给 龘䶛䨻㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁） （啦啦） 龘䶛䨻䆉（达拉崩吧）公主䥸䝟（米雅）幸福得像个童话 他们生下一个孩子也在天天渐渐长大 为了避免以后麻烦孩子称作王浩然 他的全名十分难念 我不想说一遍
	     * 
	     * 龘䶛䨻㸞蚮䡶䴞䴝䯬䬛䰕㹚（达拉崩吧帮特北迪布朵必卢翁） 
	     * 㱎䖘䵈䶁䘔䶑䘓铽䩳䵷㒪䪉䉥（昆图库踏克替考特苏哇席拉松）
	     * 䥸䝟䳮䟑䎘䫱䉷䰯䕈䟐䬝（迷牙莫拉素拉戴利谢利翁）
	     * 䥰龘䰕䘋㽌䇁䵄䵻䬛蟿䆉㖀（蒙他卢科柳司朵库毕庆把拉多）
	     */
		

		String sourceStr = "o0O";
//		String sourceStr = "龘䶛䨻㸞蚮䡶䴞䴝䯬䬛䰕㹚㱎䖘䵈䶁䘔䶑䘓铽䩳䵷㒪䪉䉥䥸䝟䳮䟑䎘䫱䉷䰯䕈䟐䬝䥰龘䰕䘋㽌䇁䵄䵻䬛蟿䆉㖀";

		int dicLength = 140;
		int lengthOfEachString = 7;
		String outFilePath = "dic.txt";
		
		
		generatDic(sourceStr, dicLength, lengthOfEachString, outFilePath);
		
	}
	

	/**
	 * 
	 * @param sourceStr 源字典字符集合
	 * @param dicLength 生成的字典的词条数目
	 * @param lengthOfEachString 每一条词条长度
	 * @param outFilePath 输出文件路径
	 */
	
	
	public static void generatDic(String sourceStr, int dicLength, int lengthOfEachString, String outFilePath) {
		int tmp;
		String tmpStr;
		String[] strings = new String[dicLength];

		StringBuilder builder = new StringBuilder();

		/**
		 * init StringBuilder
		 */
		for (int i = 0; i < lengthOfEachString; i++) {

			tmp = (int) (Math.random() * sourceStr.length());

			builder.append(sourceStr.charAt(tmp));
		}

		
		


		boolean OK = true;
		for (int x = 0; x < dicLength; x++) {
			OK = true;
			for (int i = 0; i < lengthOfEachString; i++) {

				tmp = (int) (Math.random() * sourceStr.length());


				builder.setCharAt(i, sourceStr.charAt(tmp));
			}

			tmpStr = new String(builder.toString());

			for (int y = 0; y < dicLength; y++) {
				if (tmpStr.equals(strings[y])) {
					OK = false;
					System.out.println("重复！！");
					/**
					 * 发生重复以后作业量-1，防止大概率的重复出现导致脚本不停止
					 */
					dicLength--;
					x--;
					break;
				}

			}

			if (OK) {
				System.out.println(String.format("产出了！！ %d", x + 1));
				strings[x] = tmpStr;
			}

		}

		File file = new File(outFilePath);

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		for (int x = 0; x < dicLength; x++) {
			System.out.println(strings[x]);

			try {
				if(strings[x] == null) {
					continue;
				}
				fileWriter.write(strings[x]);
				fileWriter.write('\n');
				fileWriter.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	


}
