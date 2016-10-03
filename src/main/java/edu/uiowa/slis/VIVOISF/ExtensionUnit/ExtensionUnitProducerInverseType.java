package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitProducerInverseIterator theExtensionUnitProducerInverseIterator = (ExtensionUnitProducerInverseIterator)findAncestorWithClass(this, ExtensionUnitProducerInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for producer tag ");
		}
		return SKIP_BODY;
	}
}

