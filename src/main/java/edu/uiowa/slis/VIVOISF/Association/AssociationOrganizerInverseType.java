package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationOrganizerInverseIterator theAssociationOrganizerInverseIterator = (AssociationOrganizerInverseIterator)findAncestorWithClass(this, AssociationOrganizerInverseIterator.class);
			pageContext.getOut().print(theAssociationOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for organizer tag ");
		}
		return SKIP_BODY;
	}
}

