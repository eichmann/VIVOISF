package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherAgriculturalAreaYearIterator thePublisher = (PublisherAgriculturalAreaYearIterator)findAncestorWithClass(this, PublisherAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thePublisher.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

