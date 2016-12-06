package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameOfficialESIterator thePublisher = (PublisherNameOfficialESIterator)findAncestorWithClass(this, PublisherNameOfficialESIterator.class);
			pageContext.getOut().print(thePublisher.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

