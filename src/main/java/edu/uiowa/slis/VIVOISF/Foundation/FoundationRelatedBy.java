package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationRelatedByIterator theFoundationRelatedByIterator = (FoundationRelatedByIterator)findAncestorWithClass(this, FoundationRelatedByIterator.class);
			pageContext.getOut().print(theFoundationRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

