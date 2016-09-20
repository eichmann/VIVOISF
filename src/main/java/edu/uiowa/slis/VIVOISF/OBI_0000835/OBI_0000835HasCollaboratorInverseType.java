package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835HasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835HasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835HasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835HasCollaboratorInverseIterator theOBI_0000835HasCollaboratorInverseIterator = (OBI_0000835HasCollaboratorInverseIterator)findAncestorWithClass(this, OBI_0000835HasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theOBI_0000835HasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

