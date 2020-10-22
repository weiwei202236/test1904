package com.wwxly.service;

import com.wwxly.dao.LoverDao;
import com.wwxly.domain.Lover;

public class LoverServiceImpl implements LoverService {
    private LoverDao ld;

    public void setLd(LoverDao ld) {
        this.ld = ld;
    }

    public LoverServiceImpl(LoverDao ld) {
        this.ld = ld;
    }

    @Override
    public Lover selectLover(Integer id) {
         return ld.selectLover(id);
    }
}
