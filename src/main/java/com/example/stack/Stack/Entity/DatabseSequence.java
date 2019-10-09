package com.example.stack.Stack.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection="database_sequences")
public class DatabseSequence {

    @Id
    private String id;

    private long seq;

    public String getId() {
        return id;
    }
public DatabseSequence(){}

    public DatabseSequence(String id, long seq) {
        this.id = id;
        this.seq = seq;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }
}
