package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeHasCollaboratorInverseIterator theCommitteeHasCollaboratorInverseIterator = (CommitteeHasCollaboratorInverseIterator)findAncestorWithClass(this, CommitteeHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theCommitteeHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

