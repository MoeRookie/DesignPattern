package day010;

/**
 * 麻雀
 */
public class Sparrow
implements Flyable, Tweetable, EggLayable{
    //... 省略其他属性和方法...
    private FlyAbility flyAbility = new FlyAbility(); // 组合"飞"力
    private TweetAbility tweetAbility = new TweetAbility(); // 组合"叫"力
    private EggLayAbility eggLayAbility = new EggLayAbility(); // 组合"蛋"力
    @Override
    public void layEgg() {
        //... 委托"蛋"力对象
        eggLayAbility.layEgg();
    }

    @Override
    public void fly() {
        //... 委托"飞"力对象
        flyAbility.fly();
    }

    @Override
    public void tweet() {
        //... 委托"叫"力对象
        tweetAbility.tweet();
    }
}
