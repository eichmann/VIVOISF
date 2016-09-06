package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitGoverningAuthorityForIterator theExtensionUnitGoverningAuthorityForIterator = (ExtensionUnitGoverningAuthorityForIterator)findAncestorWithClass(this, ExtensionUnitGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theExtensionUnitGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

