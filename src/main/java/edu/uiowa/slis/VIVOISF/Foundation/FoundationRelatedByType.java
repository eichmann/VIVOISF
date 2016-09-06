package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationRelatedByIterator theFoundationRelatedByIterator = (FoundationRelatedByIterator)findAncestorWithClass(this, FoundationRelatedByIterator.class);
			pageContext.getOut().print(theFoundationRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

