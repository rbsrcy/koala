package org.openkoala.businesslog.config;

import java.util.List;

/**
 * User: zjzhai
 * Date: 12/4/13
 * Time: 10:30 AM
 */
public interface BusinessLogConfigAdapter {

    String getCategory();

    String getTemplate();

    List<BusinessLogContextQuery> getQueries();

    BusinessLogConfigAdapter findConfigByBusinessOperation(String businessOperation);
}