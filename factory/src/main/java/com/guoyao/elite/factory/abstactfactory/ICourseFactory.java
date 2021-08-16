package com.guoyao.elite.factory.abstactfactory;

import com.guoyao.elite.factory.ICourse;

/**
 * @author: liyang
 * @time: 2021/8/16 15:36
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
