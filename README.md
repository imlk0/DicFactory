# ProguardDicFactory


	/**
	 * 
	 * @param sourceStr 源字典字符集合
	 * @param dicLength 生成的字典的词条数目
	 * @param lengthOfEachString 每一条词条长度
	 * @param outFilePath 输出文件路径
	 */
   
   **sample:**
   
   ```
   DicFactory.generatDic(sourceStr, dicLength, lengthOfEachString, outFilePath);
   ```
   
   **Usage:**
   
   copy outPut file to Android Studio project's app dir
   add the follows to proguard-rules.pro
   
   ```
   -classobfuscationdictionary dic.txt
   -packageobfuscationdictionary dic.txt
   -obfuscationdictionary dic.txt
   ```
