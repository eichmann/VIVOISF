package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNameOfficialARIterator thePublisher = (PublisherNameOfficialARIterator)findAncestorWithClass(this, PublisherNameOfficialARIterator.class);
			pageContext.getOut().print(thePublisher.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

