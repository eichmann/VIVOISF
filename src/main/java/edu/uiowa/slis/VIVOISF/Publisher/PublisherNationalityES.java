package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNationalityESIterator thePublisher = (PublisherNationalityESIterator)findAncestorWithClass(this, PublisherNationalityESIterator.class);
			pageContext.getOut().print(thePublisher.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

