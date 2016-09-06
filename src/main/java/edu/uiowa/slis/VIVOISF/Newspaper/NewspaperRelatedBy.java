package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperRelatedByIterator theNewspaperRelatedByIterator = (NewspaperRelatedByIterator)findAncestorWithClass(this, NewspaperRelatedByIterator.class);
			pageContext.getOut().print(theNewspaperRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

