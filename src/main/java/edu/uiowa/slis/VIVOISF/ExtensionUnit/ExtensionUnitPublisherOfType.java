package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitPublisherOfIterator theExtensionUnitPublisherOfIterator = (ExtensionUnitPublisherOfIterator)findAncestorWithClass(this, ExtensionUnitPublisherOfIterator.class);
			pageContext.getOut().print(theExtensionUnitPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

