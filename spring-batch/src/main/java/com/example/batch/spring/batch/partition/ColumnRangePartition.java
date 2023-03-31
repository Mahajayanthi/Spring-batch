package com.example.batch.spring.batch.partition;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import java.util.Map;

public class ColumnRangePartition implements Partitioner{
    @Override
    public Map<String, ExecutionContext> partition(int i) {
        return null;
    }
}
