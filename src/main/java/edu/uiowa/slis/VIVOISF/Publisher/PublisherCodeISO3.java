package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeISO3Iterator thePublisher = (PublisherCodeISO3Iterator)findAncestorWithClass(this, PublisherCodeISO3Iterator.class);
			pageContext.getOut().print(thePublisher.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

