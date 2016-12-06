package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNationalityARIterator thePublisher = (PublisherNationalityARIterator)findAncestorWithClass(this, PublisherNationalityARIterator.class);
			pageContext.getOut().print(thePublisher.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

