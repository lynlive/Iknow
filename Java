  # 基础知识
  
 <!-- 引入样式 -->
 <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-default/index.css">        
 ### Split
     String str = "abcd|efg";
     String[] arr=str.split("|");
     得到的结果：["a","b","c","d","e","f","g"];
     正确使用：str.split("\\|");
