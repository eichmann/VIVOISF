package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumHasCollaboratorIterator theConsortiumHasCollaboratorIterator = (ConsortiumHasCollaboratorIterator)findAncestorWithClass(this, ConsortiumHasCollaboratorIterator.class);
			pageContext.getOut().print(theConsortiumHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

