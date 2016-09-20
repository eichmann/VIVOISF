package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumHasCollaboratorInverseIterator theMuseumHasCollaboratorInverseIterator = (MuseumHasCollaboratorInverseIterator)findAncestorWithClass(this, MuseumHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theMuseumHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

