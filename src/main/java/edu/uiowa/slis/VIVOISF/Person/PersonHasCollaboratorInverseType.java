package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasCollaboratorInverseIterator thePersonHasCollaboratorInverseIterator = (PersonHasCollaboratorInverseIterator)findAncestorWithClass(this, PersonHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(thePersonHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

