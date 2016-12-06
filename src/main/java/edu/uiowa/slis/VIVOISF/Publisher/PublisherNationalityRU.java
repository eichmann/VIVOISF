package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNationalityRUIterator thePublisher = (PublisherNationalityRUIterator)findAncestorWithClass(this, PublisherNationalityRUIterator.class);
			pageContext.getOut().print(thePublisher.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

