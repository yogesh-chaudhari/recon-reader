package com.opus.etl.core.stream;

import java.util.stream.Stream;

import com.opus.etl.core.config.IConfig;

public interface IStream {
	public Stream streamData(IConfig config);

}
