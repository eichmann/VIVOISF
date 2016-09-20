package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasCollaboratorInverseIterator theGovernmentAgencyHasCollaboratorInverseIterator = (GovernmentAgencyHasCollaboratorInverseIterator)findAncestorWithClass(this, GovernmentAgencyHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

