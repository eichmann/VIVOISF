package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationHasCollaboratorIterator theFoundationHasCollaboratorIterator = (FoundationHasCollaboratorIterator)findAncestorWithClass(this, FoundationHasCollaboratorIterator.class);
			pageContext.getOut().print(theFoundationHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

