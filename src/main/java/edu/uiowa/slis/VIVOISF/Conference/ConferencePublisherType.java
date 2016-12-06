package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePublisherIterator theConferencePublisherIterator = (ConferencePublisherIterator)findAncestorWithClass(this, ConferencePublisherIterator.class);
			pageContext.getOut().print(theConferencePublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for publisher tag ");
		}
		return SKIP_BODY;
	}
}

