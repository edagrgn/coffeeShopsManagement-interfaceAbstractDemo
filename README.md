# Coffee Shops Management<br/>
![](https://raw.githubusercontent.com/GokhanKarakusNet/JavaCampHomeworks/master/CoffeeShopManagement/senaryo.jpg)<br/>
**Senaryoya göre Nero ve Starbucks kahve firmalarının isterleri şu şekildedir:**<br/>
-Veritabanına müşteri kaydı yapılacak (her ikisi içinde).<br/>
-Kayıt bilgisi verilecek.<br/>
-Starbucks firması kullanıcıların gerçek kişiler olduğunu kanıtlamak için MERNİS doğrulaması istemektedir.<br/>
(Nero firmasının böyle bir beklentisi yoktur fakat projenin "Open-Closed" presibine uygun çalıştığını göstermek için(istenildiğinde kaldırılmak üzere) Nero firmasına da bu özelliği ekledim.)<br/>
# MERNİS (MERKEZİ NÜFUS İDARESİ SİSTEMİ) PROJEYE EKLEME <br/>
## Üst menüden "File - New - Project"
![](https://user-images.githubusercontent.com/60423013/119227151-3a321480-bb15-11eb-8ee0-cb7a86b2316f.jpg)

## Tekrar üst menüden "File - Setting" <br/>
## Setting: "Plugins" kısmında arama yerine wsdl yazdığımızda çıkan "EasyWSDL Generator" dosyasını indirelim.<br/>
![](https://user-images.githubusercontent.com/60423013/119227222-867d5480-bb15-11eb-8f91-beba386ddf43.jpg)<br/>
![](https://user-images.githubusercontent.com/60423013/119227244-9bf27e80-bb15-11eb-823d-c4c3b22372be.jpg)<br/>
## src dosyası üzerinde "New - Package" seçerek "mernisReference" paketi oluşturalım. <br/>
![](https://user-images.githubusercontent.com/60423013/119227258-a6ad1380-bb15-11eb-8355-73cba2477d68.jpg)<br/>
## "mernisReference" paketi üzerinde sağ tıkladığımızda gelen en alttaki "EasyWSDL-Add web service" tıklayalım.<br/>
![](https://user-images.githubusercontent.com/60423013/119227281-baf11080-bb15-11eb-8055-e4d53bbe20f5.jpg)<br/>
## Wsdl URL : kısmına "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl" adresini yapıştırıp gerekli yerleri de seçtikten sonra "okey" butonuna basalım.<br/>
![](https://user-images.githubusercontent.com/60423013/119227296-d52aee80-bb15-11eb-9ace-0261f56f5125.jpg)<br/>
![](https://user-images.githubusercontent.com/60423013/119227306-e542ce00-bb15-11eb-9979-f2496d1c4613.jpg)<br/>
<br/>
<br/>
<br/>
