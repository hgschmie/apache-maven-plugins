package org.apache.maven.plugin.compiler.module;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.File;
import java.io.IOException;

/**
 * Extract information from the module-info file
 * 
 * @author Robert Scholte
 * @since 3.6.0
 */
public interface ModuleInfoParser
{
    /**
     * Defines the type of parser, i.e. using the source or the class files
     */
    public enum Type
    {
        SOURCE, CLASS
    }

    /**
     * What kind of file does the parser use
     * 
     * @return the type
     */
    Type getType();

    /**
     * Extracts the name from the module-info file
     * 
     * @param modulePath
     * @return
     * @throws IOException
     */
    JavaModuleDescriptor getModuleDescriptor( File modulePath )
        throws IOException;
}