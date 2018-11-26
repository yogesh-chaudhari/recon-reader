package com.opus.etl.core.field;

import java.util.Set;

import com.opus.etl.core.config.IConfig;
import com.opus.etl.core.record.Record;

public interface IFieldExtractor {
	public Set<String> extractFields(IConfig config,Record record);
}
