package com.facebook.react.uimanager;

/**
 * An class that is made in order to export package method of UIImplementation
 */
public class UIManagerUtils {
  public static UIViewOperationQueue getUIViewOperationQueue(UIImplementation uiImplementation) {
    return uiImplementation.getUIViewOperationQueue();
  }
}
