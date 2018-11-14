package com.github.inzahgi.spring.boot.starter.hbase.api;

import org.apache.hadoop.hbase.client.BufferedMutator;


public interface MutatorCallback {

    /**
     * 使用mutator api to update put and delete
     * @param mutator  put record
     * @throws Throwable  exception
     */
    void doInMutator(BufferedMutator mutator) throws Throwable;
}
