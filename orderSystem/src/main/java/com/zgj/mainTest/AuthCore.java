package com.zgj.mainTest;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class AuthCore {

	public static void main(String[] args) {
		AuthCore ac=new AuthCore();
		ac.authCore("generatorConfiguration.xml");
	}
	public void authCore(String fileName) {
		try {
			List<String> warnings = new ArrayList<String>();
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp
					.parseConfiguration(this.getClass().getClassLoader().getResourceAsStream(fileName));

			DefaultShellCallback shellCallback = new DefaultShellCallback(true);

			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
