/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.search.client.impl;

import com.google.gwt.search.client.Search;
import com.google.gwt.search.jsio.client.Constructor;
import com.google.gwt.search.jsio.client.JSOpaque;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

/**
 */
public interface GlocalSearch extends GSearch {
  GlocalSearch IMPL = GWT.create(GlocalSearch.class);
  JSOpaque RESULT_CLASS = new JSOpaque("$wnd.GlocalSearch.RESULT_CLASS");

  @Constructor("$wnd.GlocalSearch")
  JavaScriptObject construct();

   void setAddressLookupMode(Search jso, JSOpaque mode);

  void setCenterPoint(Search jso, JavaScriptObject point);
  
  void setCenterPoint(Search jso, String point);
}
