package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeOrganizerInverseIterator theCommitteeOrganizerInverseIterator = (CommitteeOrganizerInverseIterator)findAncestorWithClass(this, CommitteeOrganizerInverseIterator.class);
			pageContext.getOut().print(theCommitteeOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for organizer tag ");
		}
		return SKIP_BODY;
	}
}

