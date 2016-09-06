package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterHasCollaboratorIterator theCenterHasCollaboratorIterator = (CenterHasCollaboratorIterator)findAncestorWithClass(this, CenterHasCollaboratorIterator.class);
			pageContext.getOut().print(theCenterHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

