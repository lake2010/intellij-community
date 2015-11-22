/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.idea.svn.actions;

import com.intellij.vcs.VcsShowToolWindowTabAction;
import icons.SvnIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.idea.svn.SvnBundle;
import org.jetbrains.idea.svn.WorkingCopiesContent;

public class ShowSvnMapAction extends VcsShowToolWindowTabAction {

  public ShowSvnMapAction() {
    super(SvnBundle.message("action.show.svn.map.text"), SvnBundle.message("action.show.svn.map.description"), SvnIcons.ShowWorkingCopies);
  }

  @NotNull
  @Override
  protected String getTabName() {
    return WorkingCopiesContent.TAB_NAME;
  }
}
