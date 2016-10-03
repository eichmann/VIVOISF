package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitCourtInverseIterator theExtensionUnitCourtInverseIterator = (ExtensionUnitCourtInverseIterator)findAncestorWithClass(this, ExtensionUnitCourtInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for court tag ");
		}
		return SKIP_BODY;
	}
}

