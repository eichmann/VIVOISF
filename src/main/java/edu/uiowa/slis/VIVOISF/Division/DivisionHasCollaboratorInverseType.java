package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionHasCollaboratorInverseIterator theDivisionHasCollaboratorInverseIterator = (DivisionHasCollaboratorInverseIterator)findAncestorWithClass(this, DivisionHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theDivisionHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

