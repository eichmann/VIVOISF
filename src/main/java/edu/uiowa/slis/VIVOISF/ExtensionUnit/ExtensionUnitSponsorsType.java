package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitSponsorsIterator theExtensionUnitSponsorsIterator = (ExtensionUnitSponsorsIterator)findAncestorWithClass(this, ExtensionUnitSponsorsIterator.class);
			pageContext.getOut().print(theExtensionUnitSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

