package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumHasCollaboratorInverseIterator theConsortiumHasCollaboratorInverseIterator = (ConsortiumHasCollaboratorInverseIterator)findAncestorWithClass(this, ConsortiumHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theConsortiumHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

