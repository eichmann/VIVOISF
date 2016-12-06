package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameOfficialZHIterator thePublisher = (PublisherNameOfficialZHIterator)findAncestorWithClass(this, PublisherNameOfficialZHIterator.class);
			pageContext.getOut().print(thePublisher.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

