package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNationalityFRIterator thePublisher = (PublisherNationalityFRIterator)findAncestorWithClass(this, PublisherNationalityFRIterator.class);
			pageContext.getOut().print(thePublisher.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

