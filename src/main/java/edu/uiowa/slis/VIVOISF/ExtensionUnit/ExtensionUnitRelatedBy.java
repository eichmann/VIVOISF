package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitRelatedByIterator theExtensionUnitRelatedByIterator = (ExtensionUnitRelatedByIterator)findAncestorWithClass(this, ExtensionUnitRelatedByIterator.class);
			pageContext.getOut().print(theExtensionUnitRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

