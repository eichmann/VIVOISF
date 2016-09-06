package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasCollaboratorIterator thePersonHasCollaboratorIterator = (PersonHasCollaboratorIterator)findAncestorWithClass(this, PersonHasCollaboratorIterator.class);
			pageContext.getOut().print(thePersonHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

