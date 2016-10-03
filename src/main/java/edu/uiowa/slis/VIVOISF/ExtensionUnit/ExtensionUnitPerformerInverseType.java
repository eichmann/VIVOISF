package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitPerformerInverseIterator theExtensionUnitPerformerInverseIterator = (ExtensionUnitPerformerInverseIterator)findAncestorWithClass(this, ExtensionUnitPerformerInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for performer tag ");
		}
		return SKIP_BODY;
	}
}

