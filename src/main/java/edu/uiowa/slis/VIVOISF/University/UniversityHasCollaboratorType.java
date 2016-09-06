package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityHasCollaboratorIterator theUniversityHasCollaboratorIterator = (UniversityHasCollaboratorIterator)findAncestorWithClass(this, UniversityHasCollaboratorIterator.class);
			pageContext.getOut().print(theUniversityHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

