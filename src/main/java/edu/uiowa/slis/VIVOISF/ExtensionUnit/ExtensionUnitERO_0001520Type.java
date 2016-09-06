package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitERO_0001520Iterator theExtensionUnitERO_0001520Iterator = (ExtensionUnitERO_0001520Iterator)findAncestorWithClass(this, ExtensionUnitERO_0001520Iterator.class);
			pageContext.getOut().print(theExtensionUnitERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

