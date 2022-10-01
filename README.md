
![image](https://user-images.githubusercontent.com/45206582/193025201-edb1e7a4-327c-4ef6-857d-d96f4314e093.png)

Gereksinim Tanımı Bir satın alma sipariş uygulamasında Bayiler ile merkez arasında ürün siparişi ve temin şeklinde
etkileşim bulunmaktadır. Bu etkileşim Merkezin bayiler için sunmuş olduğu ürünleri bayide yer alan çalışanlar ihtiyacı
doğrultusunda ürünleri seçip sepete ekleyerek Merkez tarafına sipariş verebilmektedir.

Bu bağlamda ihtiyacımız olan 3 temel servis kümesine ihtiyaç vardır. Ürün servisi uygulaması ve kuralları

    • Ürün oluşturma, güncelleme, silme, arama API’larına sahip olacaktır.

Müşteri servisi uygulaması ve kuralları

    • Müşteri oluşturma, güncelleme, silme, arama API’larına sahip olacak. 
    
    • Bir kullanıcı olarak müşteriler tanımlayabilmeliyim ve sipariş yetkisi verebilmeliyim.

Sipariş Yönetim Servisi uygulaması ve kuralları

    • Bir kullanıcı olarak bir müşteri için sipariş kaydedebilmeliyim. Müşteri bazında siparişler listesini görüp istediğimi güncelleyebilmeliyim.
    
    • Müşteri siparişlerinin girilebildiği ve takip edilebildiği API’lara ihtiyaç vardır.
    
    • Sipariş oluşturma, güncelleme, arama API’larına sahip olacak. 
    
    • Siparişin içeriğine birden fazla ürün ekleyebileceğim. 
    
    • Siparişin bağlı olduğu bir müşteri olacaktır 
    
    • Müşterinin Sipariş yetkisi yoksa o müşteriye bağlı bir sipariş oluşturulamayacak.

Teknik Beklentiler

    • Uygulamalar Spring Boot kullanılarak geliştirilmelidir
    
    • Herhangi bir RDBMS database kullanılabilir. (MySQl/PostgreSQL/MS SQL/ Oracle)
    
    • Veri erişimlerinde Spring Data Jpa kullanılmalıdır
    
    • Tüm API’lar JSON veri tipi ile çalışmalı. 
    
    • API’ların dokümanına servis üzerinden bir adres üzerinde erişebilmeliyim(Swagger Olabilir)
    
    • Uygulamaların tümü Docker Compose kullanılarak tek komut ile çalıştırılabilmeli
    
    • Mümkünse geliştirmelerin Unit testleri olabilir
    
