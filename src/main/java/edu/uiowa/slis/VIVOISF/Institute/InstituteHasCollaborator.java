package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteHasCollaboratorIterator theInstituteHasCollaboratorIterator = (InstituteHasCollaboratorIterator)findAncestorWithClass(this, InstituteHasCollaboratorIterator.class);
			pageContext.getOut().print(theInstituteHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

