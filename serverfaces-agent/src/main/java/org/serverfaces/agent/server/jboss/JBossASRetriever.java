/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.serverfaces.agent.server.jboss;

import java.util.List;
import javax.enterprise.inject.Alternative;
import org.serverfaces.agent.server.ServerRetriever;
import org.serverfaces.common.model.Application;

/**
 *
 * @author Rafael M. Pestano - Nov 15, 2012 8:23:49 PM
 */
@Alternative
public class JBossASRetriever implements ServerRetriever{

    @Override
    public String getServerName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getServerAddress() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getServerUpTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerActiveSessions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerUsedMemory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerAvailableMemory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerCpuTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerActiveTransactions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerCommitedTransactions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerRollbackTransactions() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerActiveThreads() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long getServerTotalRequests() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getServerLog() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Application> getServerApplications() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long getServerTotalErrors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerMaxResponseTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer getServerAvgResponseTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void executeCommand(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

     

     

}
