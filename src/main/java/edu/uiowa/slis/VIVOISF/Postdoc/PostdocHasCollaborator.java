package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocHasCollaboratorIterator thePostdocHasCollaboratorIterator = (PostdocHasCollaboratorIterator)findAncestorWithClass(this, PostdocHasCollaboratorIterator.class);
			pageContext.getOut().print(thePostdocHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

