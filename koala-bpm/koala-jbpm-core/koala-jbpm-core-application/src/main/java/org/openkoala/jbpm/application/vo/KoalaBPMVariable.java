package org.openkoala.jbpm.application.vo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * KoalaBPM中的通用变量
 * @author lingen
 *
 */
@XmlRootElement()
public class KoalaBPMVariable {

	/**
	 * 流程创建者
	 */
	public static final String CREATE_USER = "KJ_USER";
	
	/**
	 * 节点处理人
	 */
	public static final String NODE_USER = "KJ_NODE_USER";
	
	/**
	 * 忽略日志节点
	 */
	public static final String INGORE_LOG = "KJ_INGORE_LOG";
	
	/**
	 *  审批结果
	 */
	public static final String COMMENT = "KJ_COMMENT";
	
	/**
	 * 审批意见
	 */
	public static final String RESULT = "KJ_RESULT";
}