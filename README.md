# ProguardDicFactory


	/**
	 * 
	 * @param sourceStr 源字典字符集合
	 * @param dicLength 生成的字典的词条数目
	 * @param lengthOfEachString 每一条词条长度
	 * @param outFilePath 输出文件路径
	 */
   
   **sample:**
   
   `generatDic(sourceStr, dicLength, lengthOfEachString, outFilePath);`
   
   **Usage:**
   
   `add follows to proguard-rules.pro`
   
   ```
   -classobfuscationdictionary ./proguard-keys.txt
   -packageobfuscationdictionary ./proguard-keys.txt
   -obfuscationdictionary ./proguard-keys.txt
   ```
