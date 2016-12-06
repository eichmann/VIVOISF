package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeISO2Iterator thePublisher = (PublisherCodeISO2Iterator)findAncestorWithClass(this, PublisherCodeISO2Iterator.class);
			pageContext.getOut().print(thePublisher.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

