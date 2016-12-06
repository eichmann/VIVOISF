package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNationalityITIterator thePublisher = (PublisherNationalityITIterator)findAncestorWithClass(this, PublisherNationalityITIterator.class);
			pageContext.getOut().print(thePublisher.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

