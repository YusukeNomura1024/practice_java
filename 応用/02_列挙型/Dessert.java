public enum Dessert {
    APPLE(100,1,"りんご"){
        @Override
        void catchCoppy(){
            System.out.println("まっかなりんごが" + getPrice() + "円！");
        }
    },
    ICE_CREAM(200,2,"乳成分・卵"){
        @Override
        void catchCoppy(){
            System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円！");
        }
    }
    , CAKE(300,3,"乳成分・卵・小麦"){
        @Override
        void catchCoppy(){
            System.out.println("皆大好き甘いケーキが" + getPrice() + "円！");
        }
    };

    private int price;
    private String rank;
    private String allergy;

    private Dessert(int price, int rank, String allergy){
        this.price = price; //価格
        this.rank = rank + "位"; //人気ランキング
        this.allergy = allergy; //アレルギー
    }

    public int getPrice(){
        return price;
    }
    public String getRank(){
        return rank;
    }
    public String getallergy(){
        return allergy;
    }

    //クラスの中でメソッドを定義しておかないと、定数のカッコ内にメソッドを記述するだけでは機能しない。
    //
    abstract void catchCoppy();
}