package com.example.demo.services;

import com.example.demo.exception.IndexNonTrouveException;
import com.example.demo.models.PathologieReponse;
import com.example.demo.utils.PathologieConstant;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PathologieServiceImpl implements PathologieService {
    @Override
    public PathologieReponse calculePathologie(Integer index) {
        if (Objects.nonNull(index)) {
            PathologieReponse reponse = new PathologieReponse();
            if (index % 5 == 0 && index % 3 == 0) {
                reponse.setUnite(PathologieConstant.CARDIAQUE_FRACTURE);
            } else if (index % 5 == 0 && index % 3 != 0) {
                reponse.setUnite(PathologieConstant.FRACTURE);
            } else if (index % 3 == 0 && index % 5 != 0) {
                reponse.setUnite(PathologieConstant.CARDIAQUE);
            } else {
                throw new IndexNonTrouveException();
            }
            return reponse;
        }
        return null;
    }
}
