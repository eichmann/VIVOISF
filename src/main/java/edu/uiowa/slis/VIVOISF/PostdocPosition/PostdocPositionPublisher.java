package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionPublisherIterator thePostdocPositionPublisherIterator = (PostdocPositionPublisherIterator)findAncestorWithClass(this, PostdocPositionPublisherIterator.class);
			pageContext.getOut().print(thePostdocPositionPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for publisher tag ");
		}
		return SKIP_BODY;
	}
}

