package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolHasCollaboratorIterator theSchoolHasCollaboratorIterator = (SchoolHasCollaboratorIterator)findAncestorWithClass(this, SchoolHasCollaboratorIterator.class);
			pageContext.getOut().print(theSchoolHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

