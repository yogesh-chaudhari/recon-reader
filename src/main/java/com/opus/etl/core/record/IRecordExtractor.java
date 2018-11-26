package com.opus.etl.core.record;

import com.opus.etl.core.config.IConfig;
import com.opus.etl.core.stream.IStream;

public interface IRecordExtractor {
	public Record extractecord(IStream stream,IConfig config);

}
