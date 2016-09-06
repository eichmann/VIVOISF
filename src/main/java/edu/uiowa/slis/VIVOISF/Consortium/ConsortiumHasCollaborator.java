package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumHasCollaboratorIterator theConsortiumHasCollaboratorIterator = (ConsortiumHasCollaboratorIterator)findAncestorWithClass(this, ConsortiumHasCollaboratorIterator.class);
			pageContext.getOut().print(theConsortiumHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

