package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperRelatedByIterator theNewspaperRelatedByIterator = (NewspaperRelatedByIterator)findAncestorWithClass(this, NewspaperRelatedByIterator.class);
			pageContext.getOut().print(theNewspaperRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

