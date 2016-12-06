package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherFreetextKeywordIterator thePublisher = (PublisherFreetextKeywordIterator)findAncestorWithClass(this, PublisherFreetextKeywordIterator.class);
			pageContext.getOut().print(thePublisher.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

