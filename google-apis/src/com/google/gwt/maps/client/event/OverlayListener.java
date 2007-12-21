/*
 * Copyright 2007 Google Inc.
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
package com.google.gwt.maps.client.event;

import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.overlay.Overlay;

/**
 * TODO: should this be named MapOverlayListener?
 */
public interface OverlayListener {

  public void onOverlayAdded(MapWidget sender, Overlay overlay);

  public void onOverlayRemoved(MapWidget sender, Overlay overlay);

  public void onOverlaysCleared(MapWidget sender);

}