package com.vinickiy.example.demo.services;

import com.vinickiy.example.demo.domain.Datum;
import com.vinickiy.example.demo.domain.UserData;

import java.util.List;

public interface ApiService {

    List<Datum> getUsers(Integer limit);
}
