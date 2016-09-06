package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherAssigneeForIterator thePublisherAssigneeForIterator = (PublisherAssigneeForIterator)findAncestorWithClass(this, PublisherAssigneeForIterator.class);
			pageContext.getOut().print(thePublisherAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

