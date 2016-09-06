package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeHasCollaboratorIterator theCommitteeHasCollaboratorIterator = (CommitteeHasCollaboratorIterator)findAncestorWithClass(this, CommitteeHasCollaboratorIterator.class);
			pageContext.getOut().print(theCommitteeHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

