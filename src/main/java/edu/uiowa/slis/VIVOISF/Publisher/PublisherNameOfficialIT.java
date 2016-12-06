package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameOfficialITIterator thePublisher = (PublisherNameOfficialITIterator)findAncestorWithClass(this, PublisherNameOfficialITIterator.class);
			pageContext.getOut().print(thePublisher.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

