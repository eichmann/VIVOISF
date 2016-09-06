package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionHasCollaboratorIterator theDivisionHasCollaboratorIterator = (DivisionHasCollaboratorIterator)findAncestorWithClass(this, DivisionHasCollaboratorIterator.class);
			pageContext.getOut().print(theDivisionHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

