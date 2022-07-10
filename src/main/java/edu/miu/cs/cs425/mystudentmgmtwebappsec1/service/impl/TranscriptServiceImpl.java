package edu.miu.cs.cs425.mystudentmgmtwebappsec1.service.impl;

import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Transcript;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.repository.TranscriptRepository;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.service.TranscriptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscriptServiceImpl implements TranscriptService {

    @Autowired
    private TranscriptRepository transcriptRepository;

    @Override
    public Transcript save(Transcript t) {
        return transcriptRepository.save(t);
    }
}
