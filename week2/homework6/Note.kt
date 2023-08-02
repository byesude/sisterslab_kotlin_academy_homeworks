package com.example.kotlinakademiodev.homeworks.week2.homework6
/*
Null-safety'nin diğer programlama dilleriyle karşılaştırıldığında avantajları nelerdir? Kotlin'in
null-safety özelliği neden diğer dillerden farklıdır?
 */


/*
Kotlin'in null-safety özelliği, diğer birçok programlama dilinden farklı olarak, daha güvenli ve
hatasız kod yazmayı destekler. Null-safety, özellikle NullPointerException (NPE) gibi yaygın hataları
engellemeye ve kodun daha tutarlı çalışmasını sağlamaya yardımcı olur.

Kotlin'in null-safety özelliğinin diğer dillerle karşılaştırıldığında avantajları:

1- NullPointerException'ları önleme: Kotlin'de, nullable olmayan tipler varsayılan olarak kullanılırken,
nullable tipler "?" ile işaretlenir. Bu sayede, nullable tiplerin kullanıldığı durumlarda NPE'leri önlemek
için bilinçli olarak işlem yapmamız gerekir. Bu, uygulamalarda oluşabilecek çoğu NullPointerException
hatasını önler.

2- Az hata: Nullable tiplerin açık bir şekilde belirtilmesi hatalı durumları daha erken
fark etmemizi sağlar. Böylece hata ayıklamak daha kolay olur.

3- Derleyici için güvenlik: Kotlin, null-safety özelliği sayesinde tüm değişkenlerin null
değerlere karşı güvende olduğundan emin olabilir. Bu, kodun daha güvenli çalışmasını
sağlar.

4- Java uyumluluğu: Kotlin, Java ile uyumlu bir dil olarak tasarlandığından, Java'dan geçiş yaparken de
 null-safety özelliği sayesinde daha az hata yapma olasılığı sağlar.
 */