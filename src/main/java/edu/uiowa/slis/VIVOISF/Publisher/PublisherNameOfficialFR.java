package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameOfficialFRIterator thePublisher = (PublisherNameOfficialFRIterator)findAncestorWithClass(this, PublisherNameOfficialFRIterator.class);
			pageContext.getOut().print(thePublisher.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

