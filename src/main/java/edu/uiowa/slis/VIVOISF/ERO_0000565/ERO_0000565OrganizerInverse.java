package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565OrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565OrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565OrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565OrganizerInverseIterator theERO_0000565OrganizerInverseIterator = (ERO_0000565OrganizerInverseIterator)findAncestorWithClass(this, ERO_0000565OrganizerInverseIterator.class);
			pageContext.getOut().print(theERO_0000565OrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for organizer tag ");
		}
		return SKIP_BODY;
	}
}

