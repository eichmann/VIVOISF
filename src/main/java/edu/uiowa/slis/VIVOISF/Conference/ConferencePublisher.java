package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePublisherIterator theConferencePublisherIterator = (ConferencePublisherIterator)findAncestorWithClass(this, ConferencePublisherIterator.class);
			pageContext.getOut().print(theConferencePublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for publisher tag ");
		}
		return SKIP_BODY;
	}
}

