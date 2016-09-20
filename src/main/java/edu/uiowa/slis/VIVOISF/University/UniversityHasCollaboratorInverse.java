package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityHasCollaboratorInverseIterator theUniversityHasCollaboratorInverseIterator = (UniversityHasCollaboratorInverseIterator)findAncestorWithClass(this, UniversityHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theUniversityHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing University for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

