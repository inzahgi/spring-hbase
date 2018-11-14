package com.github.inzahgi.spring.boot.starter.hbase.api;

import org.apache.hadoop.hbase.client.Result;

/**
 * Callback for mapping rows of a ResultScanner on a per-row basis.
 * Implementations of this interface perform the actual work of mapping each row to a result object, but don't need to worry about exception handling.
 *
 */
public interface RowMapper<T> {

    /**
     * result to entity
     * @param result return result
     * @param rowNum row num
     * @return entity
     * @throws Exception exception
     */
    T mapRow(Result result, int rowNum) throws Exception;
}
