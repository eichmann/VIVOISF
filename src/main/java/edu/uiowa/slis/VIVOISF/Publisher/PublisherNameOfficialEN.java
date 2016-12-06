package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameOfficialENIterator thePublisher = (PublisherNameOfficialENIterator)findAncestorWithClass(this, PublisherNameOfficialENIterator.class);
			pageContext.getOut().print(thePublisher.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

