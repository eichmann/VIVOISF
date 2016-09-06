package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitHasCollaboratorIterator theExtensionUnitHasCollaboratorIterator = (ExtensionUnitHasCollaboratorIterator)findAncestorWithClass(this, ExtensionUnitHasCollaboratorIterator.class);
			pageContext.getOut().print(theExtensionUnitHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

