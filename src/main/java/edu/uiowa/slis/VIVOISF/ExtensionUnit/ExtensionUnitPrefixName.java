package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitPrefixNameIterator theExtensionUnit = (ExtensionUnitPrefixNameIterator)findAncestorWithClass(this, ExtensionUnitPrefixNameIterator.class);
			pageContext.getOut().print(theExtensionUnit.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

