package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitERO_0000037Iterator theExtensionUnitERO_0000037Iterator = (ExtensionUnitERO_0000037Iterator)findAncestorWithClass(this, ExtensionUnitERO_0000037Iterator.class);
			pageContext.getOut().print(theExtensionUnitERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

