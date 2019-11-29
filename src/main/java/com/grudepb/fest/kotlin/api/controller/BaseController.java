package com.grudepb.fest.kotlin.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseController<T> {

//    private final Class<T> beanClass;

//    @Autowired
//    protected ConverterService converterService;
//
//    @Autowired
//    protected ResponseService responseService;
//
//    protected BaseController() {
//        beanClass = (Class<T>) GenericsUtils.getParametizedClass(this);
//    }
//
//    protected T convertToBean(Object dto) {
//        return converterService.convert(dto, beanClass);
//    }
//
//    protected <Z> Z convertToBean(Object dto, Class<Z> clazz) {
//        return converterService.convert(dto, clazz);
//    }
//
//    protected <Z> Z convertToDto(Object bean, Class<Z> dtoClass) {
//        return converterService.convert(bean, dtoClass);
//    }
//
//    protected <Z> Response<Z> convertToResponse(Object bean, Class<Z> dtoClass) {
//        return responseService.create(convertToDto(bean, dtoClass));
//    }
//
//    protected <Z> ResponseList<Z> convertToResponse(List<?> list, Class<Z> dtoClass) {
//        return responseService.create(list.stream()
//                .map(i -> convertToDto(i, dtoClass))
//                .collect(Collectors.toList()));
//    }
//
//    protected <Z> Response<Z> convertToResponse(Z bean) {
//        return responseService.create(bean);
//    }

}