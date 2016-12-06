package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPublisherIterator theConferencePosterPublisherIterator = (ConferencePosterPublisherIterator)findAncestorWithClass(this, ConferencePosterPublisherIterator.class);
			pageContext.getOut().print(theConferencePosterPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for publisher tag ");
		}
		return SKIP_BODY;
	}
}

