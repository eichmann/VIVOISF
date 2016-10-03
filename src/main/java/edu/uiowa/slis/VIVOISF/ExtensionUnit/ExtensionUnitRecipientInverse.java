package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitRecipientInverseIterator theExtensionUnitRecipientInverseIterator = (ExtensionUnitRecipientInverseIterator)findAncestorWithClass(this, ExtensionUnitRecipientInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for recipient tag ");
		}
		return SKIP_BODY;
	}
}

