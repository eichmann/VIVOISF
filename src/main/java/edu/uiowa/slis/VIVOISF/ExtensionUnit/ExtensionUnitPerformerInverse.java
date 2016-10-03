package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitPerformerInverseIterator theExtensionUnitPerformerInverseIterator = (ExtensionUnitPerformerInverseIterator)findAncestorWithClass(this, ExtensionUnitPerformerInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for performer tag ");
		}
		return SKIP_BODY;
	}
}

