/*******************************************************************************
 * Copyright (c) 2013 Beligum b.v.b.a. (http://www.beligum.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Beligum - initial implementation
 *******************************************************************************/
package com.beligum.cms.utils;

import java.util.ArrayList;
import java.util.List;

public class ChildPagesToCreate
{
    // -----CONSTANTS-----

    // -----VARIABLES-----
    public Long parentId;

    public List<String> urlNames;

    // -----CONSTRUCTORS-----
    public ChildPagesToCreate()
    {
	parentId = null;
	urlNames = new ArrayList<String>();
    }

    // -----PUBLIC FUNCTIONS-----

    // -----PROTECTED FUNCTIONS-----

    // -----PRIVATE FUNCTIONS-----
}