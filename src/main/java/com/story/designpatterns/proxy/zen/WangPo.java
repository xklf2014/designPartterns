package com.story.designpatterns.proxy.zen;

/**
 * 王婆这个人老聪明了，她太老了，是个男人都看不上，
 * 但是她有智慧有经验呀，她作为一类女人的代理
 */
public class WangPo implements KindWomen {
    private KindWomen kindWomen;

    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyeWithMan() {
        kindWomen.makeEyeWithMan();
    }

    @Override
    public void happyWithMan() {
        kindWomen.happyWithMan();
    }
}
