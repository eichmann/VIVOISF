package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(URLRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			URLRelatedByIterator theURLRelatedByIterator = (URLRelatedByIterator)findAncestorWithClass(this, URLRelatedByIterator.class);
			pageContext.getOut().print(theURLRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

