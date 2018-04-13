package com.example.luizrsoliveira2.heroiapp;

public class Api {

                                                  //↓ IPV4 do webservice
    private static final String ROOT_URL = "http://10.23.49.30:8080/ti87/php/HeroApi/v1/Api.php?apicall=";

    public static final String URL_CREATE_HERO = ROOT_URL + "createhero";
    public static final String URL_READ_HEROES = ROOT_URL + "getheroes";
    public static final String URL_UPDATE_HERO = ROOT_URL + "updatehero";
    public static final String URL_DELETE_HERO = ROOT_URL + "deletehero&id=";



}
