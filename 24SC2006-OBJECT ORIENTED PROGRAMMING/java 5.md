string builder 
StringBuilder sb = new StringBuilder("initial string");
 new keyword is used to allocate some new memory space and sting builder is mutable and unlike normal strings which are immutable
stringbuilder does not guaranteed synchronization
StringClass --skipped
StringBuffer it will provide synchronizations 

String builder is faster then string buffer

works for both string builder and string buffer 
sb.append("") will add some new string to old string 
sb.insert(pos,"val");