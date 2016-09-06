package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasCollaboratorIterator thePublisherHasCollaboratorIterator = (PublisherHasCollaboratorIterator)findAncestorWithClass(this, PublisherHasCollaboratorIterator.class);
			pageContext.getOut().print(thePublisherHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

