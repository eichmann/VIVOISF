package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumHasCollaboratorInverseIterator theMuseumHasCollaboratorInverseIterator = (MuseumHasCollaboratorInverseIterator)findAncestorWithClass(this, MuseumHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theMuseumHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

