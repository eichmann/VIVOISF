package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionPublisherIterator thePostdocPositionPublisherIterator = (PostdocPositionPublisherIterator)findAncestorWithClass(this, PostdocPositionPublisherIterator.class);
			pageContext.getOut().print(thePostdocPositionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for publisher tag ");
		}
		return SKIP_BODY;
	}
}

