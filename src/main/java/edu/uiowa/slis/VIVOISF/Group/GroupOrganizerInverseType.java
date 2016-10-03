package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupOrganizerInverseIterator theGroupOrganizerInverseIterator = (GroupOrganizerInverseIterator)findAncestorWithClass(this, GroupOrganizerInverseIterator.class);
			pageContext.getOut().print(theGroupOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for organizer tag ");
		}
		return SKIP_BODY;
	}
}

