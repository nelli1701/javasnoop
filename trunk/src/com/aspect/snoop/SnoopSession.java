/*
 * Copyright, Aspect Security, Inc.
 *
 * This file is part of JavaSnoop.
 *
 * JavaSnoop is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JavaSnoop is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JavaSnoop.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aspect.snoop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SnoopSession implements Serializable {

    /*
     * Stuff for persistence.
     */
    boolean hasAlreadyBeenSaved;
    String snoopSessionFilename;

    /*
     * Actual Snoop session information, the stuff we need
     * to re-create the screen the user left off on.
     */
    int processId;
    String workingDir;
    String classpathString;
    String arguments;
    String javaArguments;
    String mainClass;

    List<FunctionHookInterceptor> functionHooks;

    String output;

    public SnoopSession() {

        //initialize and empty everything - serialization breaks if anything is
        //null.
        
        snoopSessionFilename = "(not saved yet)";
        workingDir = "";
        classpathString = "";
        arguments = "";
        javaArguments = "";
        mainClass = "";
        output = "";
        
        functionHooks = new ArrayList<FunctionHookInterceptor>();
       
    }

    public boolean alreadyBeenSaved() {
        return hasAlreadyBeenSaved;
    }

    public void markAsSaved() {
        this.hasAlreadyBeenSaved = true;
    }

    public void markAsUnsaved() {
        this.hasAlreadyBeenSaved = false;
    }

    /**
     * @return the snoopSessionFilename
     */
    public String getSnoopSessionFilename() {
        return snoopSessionFilename;
    }

    /**
     * @param snoopSessionFilename the snoopSessionFilename to set
     */
    public void setSnoopSessionFilename(String spySessionFilename) {
        this.snoopSessionFilename = spySessionFilename;
    }

    /**
     * @return the processId
     */
    public /*
     * Actual Spy session information, the stuff we need
     * to re-create the screen the user left off on.
     */
    int getProcessId() {
        return processId;
    }

    /**
     * @param processId the processId to set
     */
    public void setProcessId(int processId) {
        this.processId = processId;
    }

    /**
     * @return the arguments
     */
    public String getArguments() {
        return arguments;
    }

    /**
     * @param arguments the arguments to set
     */
    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    /**
     * @return the functionHooks
     */
    public List<FunctionHookInterceptor> getFunctionHooks() {
        return functionHooks;
    }

    /**
     * @param functionHooks the functionHooks to set
     */
    public void setFunctionHooks(List<FunctionHookInterceptor> functionHooks) {
        this.functionHooks = functionHooks;
    }

    /**
     * @return the output
     */
    public String getOutput() {
        return output;
    }

    /**
     * @param output the output to set
     */
    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * @return the workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    /**
     * @param workingDir the workingDir to set
     */
    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    /**
     * @return the classpathString
     */
    public String getClasspathString() {
        return classpathString;
    }

    /**
     * @param classpathString the classpathString to set
     */
    public void setClasspathString(String classpathString) {
        this.classpathString = classpathString;
    }

    /**
     * @return the javaArguments
     */
    public String getJavaArguments() {
        return javaArguments;
    }

    /**
     * @param javaArguments the javaArguments to set
     */
    public void setJavaArguments(String javaArguments) {
        this.javaArguments = javaArguments;
    }

    /**
     * @return the mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    /**
     * @param mainClass the mainClass to set
     */
    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    
}
