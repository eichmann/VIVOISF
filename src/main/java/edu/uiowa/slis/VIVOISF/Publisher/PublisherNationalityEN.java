package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNationalityENIterator thePublisher = (PublisherNationalityENIterator)findAncestorWithClass(this, PublisherNationalityENIterator.class);
			pageContext.getOut().print(thePublisher.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

