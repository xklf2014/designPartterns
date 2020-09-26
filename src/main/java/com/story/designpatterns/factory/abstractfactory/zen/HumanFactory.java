package com.story.designpatterns.factory.abstractfactory.zen;

/**
 * 这次定一个接口，应该要造不同性别的人，需要不同的生产线
 * 那这个八卦炉必须可以制造男人和女人
 */
public interface HumanFactory {
    Human createYellowHuman();

    Human createWhiteHuman();

    Human createBlackHuman();
}
