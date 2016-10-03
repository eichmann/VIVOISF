package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocOrganizerInverseIterator thePostdocOrganizerInverseIterator = (PostdocOrganizerInverseIterator)findAncestorWithClass(this, PostdocOrganizerInverseIterator.class);
			pageContext.getOut().print(thePostdocOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for organizer tag ");
		}
		return SKIP_BODY;
	}
}

