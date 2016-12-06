package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NameRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NameRelatedByIterator theNameRelatedByIterator = (NameRelatedByIterator)findAncestorWithClass(this, NameRelatedByIterator.class);
			pageContext.getOut().print(theNameRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

