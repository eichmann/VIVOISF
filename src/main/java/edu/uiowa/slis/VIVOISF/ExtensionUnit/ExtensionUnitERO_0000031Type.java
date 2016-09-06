package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitERO_0000031Iterator theExtensionUnitERO_0000031Iterator = (ExtensionUnitERO_0000031Iterator)findAncestorWithClass(this, ExtensionUnitERO_0000031Iterator.class);
			pageContext.getOut().print(theExtensionUnitERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

