package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteHasCollaboratorInverseIterator theInstituteHasCollaboratorInverseIterator = (InstituteHasCollaboratorInverseIterator)findAncestorWithClass(this, InstituteHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theInstituteHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

