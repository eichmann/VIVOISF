package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitOBI_0000304InverseIterator theExtensionUnitOBI_0000304InverseIterator = (ExtensionUnitOBI_0000304InverseIterator)findAncestorWithClass(this, ExtensionUnitOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theExtensionUnitOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

