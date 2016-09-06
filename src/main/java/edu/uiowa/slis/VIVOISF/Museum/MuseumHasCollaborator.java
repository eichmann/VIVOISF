package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumHasCollaboratorIterator theMuseumHasCollaboratorIterator = (MuseumHasCollaboratorIterator)findAncestorWithClass(this, MuseumHasCollaboratorIterator.class);
			pageContext.getOut().print(theMuseumHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

