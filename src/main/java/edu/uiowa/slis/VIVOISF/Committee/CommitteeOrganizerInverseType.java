package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeOrganizerInverseIterator theCommitteeOrganizerInverseIterator = (CommitteeOrganizerInverseIterator)findAncestorWithClass(this, CommitteeOrganizerInverseIterator.class);
			pageContext.getOut().print(theCommitteeOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for organizer tag ");
		}
		return SKIP_BODY;
	}
}

