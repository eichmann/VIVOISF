package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitSuffixNameIterator theExtensionUnit = (ExtensionUnitSuffixNameIterator)findAncestorWithClass(this, ExtensionUnitSuffixNameIterator.class);
			pageContext.getOut().print(theExtensionUnit.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

