package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolHasCollaboratorInverseIterator theSchoolHasCollaboratorInverseIterator = (SchoolHasCollaboratorInverseIterator)findAncestorWithClass(this, SchoolHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theSchoolHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

