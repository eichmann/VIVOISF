package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835HasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835HasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835HasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835HasCollaboratorIterator theOBI_0000835HasCollaboratorIterator = (OBI_0000835HasCollaboratorIterator)findAncestorWithClass(this, OBI_0000835HasCollaboratorIterator.class);
			pageContext.getOut().print(theOBI_0000835HasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

