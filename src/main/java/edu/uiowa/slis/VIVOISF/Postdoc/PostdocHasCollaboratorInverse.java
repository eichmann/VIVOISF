package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocHasCollaboratorInverseIterator thePostdocHasCollaboratorInverseIterator = (PostdocHasCollaboratorInverseIterator)findAncestorWithClass(this, PostdocHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(thePostdocHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

