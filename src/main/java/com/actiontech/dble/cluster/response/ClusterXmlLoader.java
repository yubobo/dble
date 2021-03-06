/*
 * Copyright (C) 2016-2019 ActionTech.
 * License: http://www.gnu.org/licenses/gpl.html GPL version 2 or higher.
 */

package com.actiontech.dble.cluster.response;

import com.actiontech.dble.cluster.bean.KvBean;

/**
 * Created by szf on 2018/1/26.
 */
public interface ClusterXmlLoader {

    void notifyProcess(KvBean configValue) throws Exception;

    void notifyCluster() throws Exception;
}
