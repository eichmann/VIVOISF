package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasCollaboratorInverseIterator thePublisherHasCollaboratorInverseIterator = (PublisherHasCollaboratorInverseIterator)findAncestorWithClass(this, PublisherHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(thePublisherHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

