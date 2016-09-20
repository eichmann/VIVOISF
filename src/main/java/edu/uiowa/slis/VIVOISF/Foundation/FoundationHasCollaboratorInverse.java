package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationHasCollaboratorInverseIterator theFoundationHasCollaboratorInverseIterator = (FoundationHasCollaboratorInverseIterator)findAncestorWithClass(this, FoundationHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theFoundationHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

