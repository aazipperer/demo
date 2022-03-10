/*******************************************************************************
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
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.demo.components.imagetext;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class imagetext__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _dynamic_wcmmode = bindings.get("wcmmode");
_global_model = renderContext.call("use", com.accenture.core.models.ImageTextModel.class.getName(), obj());
out.write("<div class=\"cmp-imagetext\">\n    ");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_global_model, "text");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cmp-imagetext__text-item\">\n        <div class=\"cmp-imagetext__text-item-output\">");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text"), "text");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</div>\n    </div>");
    }
}
out.write("\n    \n    ");
{
    Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_global_model, "image");
    if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
        out.write("<div class=\"cmp-imagetext__image-item\">\n    \t<img class=\"cmp-imagetext__image-item-output\"");
        {
            Object var_attrvalue3 = renderContext.getObjectModel().resolveProperty(_global_model, "image");
            {
                Object var_attrcontent4 = renderContext.call("xss", var_attrvalue3, "uri");
                {
                    boolean var_shoulddisplayattr6 = (((null != var_attrcontent4) && (!"".equals(var_attrcontent4))) && ((!"".equals(var_attrvalue3)) && (!((Object)false).equals(var_attrvalue3))));
                    if (var_shoulddisplayattr6) {
                        out.write(" src");
                        {
                            boolean var_istrueattr5 = (var_attrvalue3.equals(true));
                            if (!var_istrueattr5) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent4));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue7 = renderContext.getObjectModel().resolveProperty(_global_model, "imageAlt");
            {
                Object var_attrcontent8 = renderContext.call("xss", var_attrvalue7, "attribute");
                {
                    boolean var_shoulddisplayattr10 = (((null != var_attrcontent8) && (!"".equals(var_attrcontent8))) && ((!"".equals(var_attrvalue7)) && (!((Object)false).equals(var_attrvalue7))));
                    if (var_shoulddisplayattr10) {
                        out.write(" alt");
                        {
                            boolean var_istrueattr9 = (var_attrvalue7.equals(true));
                            if (!var_istrueattr9) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent8));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            String var_attrcontent11 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "imageTitle"), "attribute")) + " Alfredo");
            out.write(" title=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent11));
            out.write("\"");
        }
        out.write("/>\n    </div>");
    }
}
out.write("\n    \n    ");
{
    Object var_testvariable12 = ((((!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "text"))) && (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "image")))) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : ((!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "text"))) && (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "image"))))));
    if (renderContext.getObjectModel().toBoolean(var_testvariable12)) {
        out.write("<div>\n        <div>Text + Image Component</div>\n    </div>");
    }
}
out.write("\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

