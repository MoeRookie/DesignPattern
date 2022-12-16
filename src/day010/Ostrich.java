package day010;

/**
 * 鸵鸟
 */
public class Ostrich
implements Tweetable, EggLayable{
    //... 省略其他属性和方法...
    private TweetAbility tweetAbility = new TweetAbility(); // 组合"叫"力
    private EggLayAbility eggLayAbility = new EggLayAbility(); // 组合"蛋"力
    @Override
    public void layEgg() {
        //... 委托具体"蛋"力对象
        eggLayAbility.layEgg();
    }

    @Override
    public void tweet() {
        //... 委托具体"叫"力对象
        tweetAbility.tweet();
    }
}
