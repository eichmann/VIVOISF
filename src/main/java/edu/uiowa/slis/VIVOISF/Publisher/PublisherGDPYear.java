package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherGDPYearIterator thePublisher = (PublisherGDPYearIterator)findAncestorWithClass(this, PublisherGDPYearIterator.class);
			pageContext.getOut().print(thePublisher.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

