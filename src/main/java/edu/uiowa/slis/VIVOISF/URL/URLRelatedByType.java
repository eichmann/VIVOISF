package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(URLRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			URLRelatedByIterator theURLRelatedByIterator = (URLRelatedByIterator)findAncestorWithClass(this, URLRelatedByIterator.class);
			pageContext.getOut().print(theURLRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing URL for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

