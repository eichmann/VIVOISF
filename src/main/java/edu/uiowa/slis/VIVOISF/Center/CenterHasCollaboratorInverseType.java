package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterHasCollaboratorInverseIterator theCenterHasCollaboratorInverseIterator = (CenterHasCollaboratorInverseIterator)findAncestorWithClass(this, CenterHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theCenterHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

