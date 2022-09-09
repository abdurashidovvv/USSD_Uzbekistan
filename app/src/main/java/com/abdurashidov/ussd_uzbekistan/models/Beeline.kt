package com.abdurashidov.ussd_uzbekistan.models


object Beeline {
    var beelineList = ArrayList<MyInfo>()
    var ucellList = ArrayList<MyInfo>()
    var mobiuzList = ArrayList<MyInfo>()
    var uzmobileList = ArrayList<MyInfo>()

    fun loadBeelineData() {
        beelineList.add(MyInfo(1,
            "1 GB",
            "Amal qilish muddati: 30 kun",
            "10 000 SO'M",
            "Ulanish kodi *1*01*8186# \nQoldiqni tekshirish: *103#",
            "*1*01*8186#"))
        beelineList.add(MyInfo(1,
            "2 GB",
            "Amal qilish muddati: 30 kun",
            "15 000 SO'M",
            "Ulanish kodi *1*02*8186# \nQoldiqni tekshirish: *103#",
            "*1*02*8186#"))
        beelineList.add(MyInfo(1,
            "5 GB",
            "Amal qilish muddati: 30 kun",
            "25 000 SO'M",
            "Ulanish kodi *1*05*8186# \nQoldiqni tekshirish: *103#",
            "*1*05*8186"))
        beelineList.add(MyInfo(1,
            "10 GB",
            "Amal qilish muddati: 30 kun",
            "10 000 SO'M",
            "Ulanish kodi *1*10*8186# \nQoldiqni tekshirish: *103#",
            "*1*10*8186#"))
        beelineList.add(MyInfo(1,
            "20 GB",
            "Amal qilish muddati: 30 kun",
            "10 000 SO'M",
            "Ulanish kodi *1*20*8186# \nQoldiqni tekshirish: *103#",
            "*1*20*8186#"))
        beelineList.add(MyInfo(1,
            "30 GB",
            "Amal qilish muddati: 30 kun",
            "10 000 SO'M",
            "Ulanish kodi *1*30*8186# \nQoldiqni tekshirish: *103#",
            "*1*30*8186#"))
        beelineList.add(MyInfo(1,
            "50 GB",
            "Amal qilish muddati: 30 kun",
            "10 000 SO'M",
            "Ulanish kodi *1*50*8186# \nQoldiqni tekshirish: *103#",
            "*1*50*8186#"))
        beelineList.add(MyInfo(1,
            "75 GB",
            "Amal qilish muddati: 30 kun",
            "10 000 SO'M",
            "Ulanish kodi *1*75*8186# \nQoldiqni tekshirish: *103#",
            "*1*75*8186#"))

        beelineList.add(MyInfo(2,
            "Oson 10",
            "Amal qilish muddati: 30 kun",
            "10 000 SO'M",
            "Abonent to'lovi: 10 000 so'm. \nChiquvchi O'zb. bo'yicha: 10 daq. \nSMS: 10 ta\nInternet: 10mb\n1 mb/daq/sms=100 so'm",
            "*110*61#"))
        beelineList.add(MyInfo(2,
            "Hammsi zo'r 1",
            "Amal qilish muddati: 30 kun",
            "20 000 SO'M",
            "Abonent to'lovi: 20 000 so'm. \nChiquvchi O'zb. bo'yicha: 1500 daq. \nSMS: 500 ta\nInternet: 3 GB\nTungi internet: 9 GB\nPerezagruzka xizmati: *5#",
            "*2*3#"))
        beelineList.add(MyInfo(2,
            "Hammsi zo'r 2",
            "Amal qilish muddati: 30 kun",
            "30 000 SO'M",
            "Abonent to'lovi: 30 000 so'm. \nChiquvchi O'zb. bo'yicha: 2500 daq. \nSMS: 500 ta\nInternet: 5 GB\nTungi internet: 15 GB\nPerezagruzka xizmati: *5#",
            "*2*5#"))
        beelineList.add(MyInfo(2,
            "Hammsi zo'r 3",
            "Amal qilish muddati: 30 kun",
            "40 000 SO'M",
            "Abonent to'lovi: 40 000 so'm. \nChiquvchi O'zb. bo'yicha: Vip. \nSMS: 1000 ta\nInternet: 8 GB\nTungi internet: 24 GB\nPerezagruzka xizmati: *5#",
            "*2*8#"))
        beelineList.add(MyInfo(2,
            "Hammsi zo'r 4",
            "Amal qilish muddati: 30 kun",
            "60 000 SO'M",
            "Abonent to'lovi: 60 000 so'm. \nChiquvchi O'zb. bo'yicha: 1500 daq. \nSMS: 1000 ta\nInternet: 30 GB\nTungi internet: 90 GB\nPerezagruzka xizmati: *5#",
            "*2*15#"))
        beelineList.add(MyInfo(2,
            "STATUS SILVER",
            "Amal qilish muddati: 30 kun",
            "90 000 SO'M",
            "Abonent to'lovi: 90 000 so'm. \nChiquvchi O'zb. bo'yicha: Vip. \nSMS: 2000 ta\nInternet: 15 GB\nTungi internet: 45 GB\nPerezagruzka xizmati: *5#",
            "*2*30#"))
        beelineList.add(MyInfo(2,
            "STATUS GOLD",
            "Amal qilish muddati: 30 kun",
            "135 000 SO'M",
            "Abonent to'lovi: 135 000 so'm. \nChiquvchi O'zb. bo'yicha: Vip. \nSMS: 2000 ta\nInternet: 50 GB\nTungi internet: 150 GB\nPerezagruzka xizmati: *5#",
            "*2*50#"))
        beelineList.add(MyInfo(2,
            "STATUS PLATINUM",
            "Amal qilish muddati: 30 kun",
            "200 000 SO'M",
            "Abonent to'lovi: 200 000 so'm. \nChiquvchi O'zb. bo'yicha: Vip. \nSMS: 2000 ta\nInternet: 150 GB\nTungi internet: 450 GB\nPerezagruzka xizmati: *5#",
            "*2*150#"))

        beelineList.add(MyInfo(3,
            "Ko'p so'zla",
            "Amal qilish muddati: 30 kun",
            "10 000 SO'M",
            "Ulanish kodi *108# \nQoldiqni tekshirish: *108#",
            "*108#"))



        beelineList.add(MyInfo(4,
            "«Smartphone bonus»",
            "Yangi smartfon sotib oling! Beelinega ulaning! 3 oy davomida 5 GB dan bonusga ega bo'ling!",
            "",
            "Yangi smartfon sotib oling! Beelinega ulaning! 3 oy davomida 5 GB dan bonusga ega bo'ling! \n \nSmartfonni O'zbekiston bo'ylab istalgan yangi smartfonlar sotiladigan savdo nuqtalaridan xarid qilishingiz mumkin. Aksiyada mamlakatimizda ishlab chiqarilgan va O'zbekiston Respublikasi hududiga qonuniy ravishda olib kirilgan smartfonlar ishtirok etadi.\nBonusni ulash imkoniyati mavjudligini bilish uchun smartfonda SIM-karta faollashtirilgan kundan bir kun o'tib, Beeline Uzbekistan ilovasi yoki *110*09# kodini terish orqali raqamda ulangan xizmatlar ro'yxatida «Aksiya Smartfon» xizmati mavjudligiga ishonch hosil qilishingiz kerak. ",
            "*110*09#"))
        beelineList.add(MyInfo(4,
            "«Juma takliflari»",
            "2022y. 4 martidan boshlab har juma sizni maxsus takliflarimiz kutadi!\n",
            "",
            "Beeline TV (telekanallar) uchun 10 kunga JUMATV3 promokodi. \n \nInstagram, Facebook va Odnoklassnikiga 150 GB paketi 30 kunga atigi 30 000 so’mga,\n40 GB paketi 7 kunga atigi 30 000 so’mga, \n100 GB paketi 1 kunga atigi 15 000 so’mga.\n150 GB paketi 30 kunga atigi 90 000 so’mga.",
            "*110*09#"))
        beelineList.add(MyInfo(4,
            "«Aksiya 13»",
        "2022-yilning 1-iyundan 30-avgustigacha har hafta bittadan “Apple iPhone 13 128 GB” smartfoni o'ynaladi!",
        "",
        "Aksiyada ishtirok etish uchun Beepul orqali istalgan xizmat uchun 20 000 so'm va undan yuqori bo'lgan to'lovni amalga oshiring.\n" +
                "20 000 so'm va undan yuqori bo'lgan har bir to'lov, ishtirokchiga aksiya doirasida sovrin yutib olish uchun 1 ta imkoniyat beradi.\n" +
                "Pul o'tkazmalari ushbu aksiyada amal qilmaydi.\n" +
                "G'oliblar 2022-yilning 8-iyunidan 31-avgustiga qadar har chorshanba kuni soat 15:00 da Beeline Uzbekistan/Beepulning Facebook yoki Instagramdagi sahifalarida aniqlanadi.",
        ""))
        beelineList.add(MyInfo(4,
        "«4G Bonus»",
        " Ko'proq internet istaysizmi?\n«Beepul», «Beeline TV» va «Beeline Music & Radio» raqamli xizmatlarimizning foydalanuvchisiga aylaning va har oy 3GBgacha trafikka ega bo'ling!",
        "",
        "«Beeline TV» da bonus olish uchun quyidagilarni amalga oshirish kerak:\n" +
                "1. Ilovani  yuklang yoki *6# ;\n" +
                "2. Ro'yxatdan o'tish.\n" +
                "3. Istalgan obunaga ulanish.\n" +
                "4. Obunalar bo'limidagi tegishli aksiya tugmasini bosib, bonusni faollashtirish kerak.\n" +
                "\n" +
                "«Beeline Music & Radio» da bonus olish uchun quyidagilarni amalga oshirish kerak:\n" +
                "1. Ilovani  yuklang yoki *9#;\n" +
                "2. Ro'yxatdan o'tish.\n" +
                "3. Istalgan obunaga ulanish.\n" +
                "4. «4G BONUS» bannerini bosish.\n" +
                "5. «4G BONUS» aksiya tugmasini bosish.\n" +
                "\n" +
                "Beepul foydalanuvchilari uchun:\n" +
                "1. Ilovani yuklang yoki *2#;\n" +
                "2. Ro'yxatdan o'tish;\n" +
                "3. Bank kartani qo'shish;\n" +
                "4. To'lovni amalga oshirish;\n" +
                "5. Xabarnomalar bo'limiga kirish lozim (qo'ng'iroq);\n" +
                "6. Keyin «4G BONUS» aksiya tugmasini bosish kerak.\n" +
                "\n" +
                "Bu hali hammasi emas! Agar Siz 3ta ilovada 4G bonusni faollashtirsangiz, unda oyiga 3GB trafikgacha ega bo'lishingiz mumkin!\n" +
                "Ushbu bonus faqat 4G tarmog'ida sarflanadi, 2G/3G tarmoqlarida sarflanmaydi.\n" +
                "Sizning qurilmangiz 4G tarmog'ini qo'llab-quvvatlashini tekshirish uchun *24# kodini tering. Ushbu havola bo'yicha esa  https://beeline.uz/uz/coverage-and-offices 4G tarmog'i qoplagan hududlarni tekshirishingiz mumkin.\n",
        ""))



        beelineList.add(MyInfo(5,
            "100 SMS",
            "Amal qilish muddati: 30 kun",
            "5200 SO'M",
            "Ulanish kodi *110*044# \nQoldiqni tekshirish: *105#",
            "*110*044#"))
        beelineList.add(MyInfo(5,
            "500 SMS",
            "Amal qilish muddati: 30 kun",
            "13 600 SO'M",
            "Ulanish kodi *110*045# \nQoldiqni tekshirish: *105#",
            "*110*045#"))
        beelineList.add(MyInfo(5,
            "1000 SMS",
            "Amal qilish muddati: 30 kun",
            "22 100 SO'M",
            "Ulanish kodi *110*046# \nQoldiqni tekshirish: *105#",
            "*110*046#"))
        beelineList.add(MyInfo(5,
            "25 SMS",
            "Xalqaro sms paket",
            "5200 SO'M",
            "Ulanish kodi *110*041# \nQoldiqni tekshirish: *105#",
            "*110*041#"))
        beelineList.add(MyInfo(5,
            "50 SMS",
            "Xalqaro sms paket",
            "8400 SO'M",
            "Ulanish kodi *110*042# \nQoldiqni tekshirish: *105#",
            "*110*042#"))
        beelineList.add(MyInfo(5,
            "100 SMS",
            "Xalqaro sms paket",
            "12 600 SO'M",
            "Ulanish kodi *110*043# \nQoldiqni tekshirish: *105#",
            "*110*043#"))


        beelineList.add(MyInfo(6,
        "USSD kodlari",
        "Beeline abonentlari uchun foydali telefonlar va USSD-kodlar",
        "",
        "Aloqa operatori Beeline abonentlari uchun mahsus foydali telefonlar haqida eslatib o‘tadi, ushbu telefonlarga qo‘ng‘iroq qilib yoki so‘rov yuborgan holda zarur bo‘lgan ma'lumotlarni operativ tarzda olish mumkin.\n" +
                "\n" +
                "Hisob holatini Beeline abonentlari *102# USSD-so‘rovi orqali yoki 0697 qisqa raqamiga qo‘ng‘iroq qilgan tarzda bilishlari mumkin.\n" +
                "\n" +
                "Dollar kursini *110*00# USSD-so‘rovi orqali bilish mumkin.\n" +
                "\n" +
                "So‘rov paytida ulangan xizmatlar haqida ma'lumotni aniqlash uchun *110*09# terish zarur.\n" +
                "\n" +
                "Daqiqalar qoldig‘ini bilish uchun *106# USSD-so‘rovini terish kerak.\n" +
                "\n" +
                "SMS qoldig‘i haqidagi ma'lumotni *105# raqami bo‘yicha, hamda megabayt qoldig‘i haqida *103# raqamiga so‘rovni yuborgan holda bilish mumkin.\n" +
                "\n" +
                "Beeline Club a'zolari *107# USSD-so‘rov orqali daqiqalar va SMS qoldig‘i haqida ma'lumot olishlari mumkin, *117# so‘rovini yuborgan holda esa bonus balansini tekshirishlari mumkin.\n" +
                "\n" +
                "Joriy tarif rejasining parametrlarini *110*05# raqami bo‘yicha bilish mumkin.\n" +
                "\n" +
                "O‘z raqamingizni tasdiqlash uchun *148# USSD-so‘rovini terish kerak bo‘ladi.",
        ""))

    }

    fun loadUcellData() {
    }

}