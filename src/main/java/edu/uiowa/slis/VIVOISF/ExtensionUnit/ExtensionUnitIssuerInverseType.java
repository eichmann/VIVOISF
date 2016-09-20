package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitIssuerInverseIterator theExtensionUnitIssuerInverseIterator = (ExtensionUnitIssuerInverseIterator)findAncestorWithClass(this, ExtensionUnitIssuerInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for issuer tag ");
		}
		return SKIP_BODY;
	}
}

