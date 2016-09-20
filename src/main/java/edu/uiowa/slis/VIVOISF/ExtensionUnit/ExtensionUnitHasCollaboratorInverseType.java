package edu.uiowa.slis.VIVOISF.ExtensionUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExtensionUnitHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExtensionUnitHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExtensionUnitHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExtensionUnitHasCollaboratorInverseIterator theExtensionUnitHasCollaboratorInverseIterator = (ExtensionUnitHasCollaboratorInverseIterator)findAncestorWithClass(this, ExtensionUnitHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theExtensionUnitHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ExtensionUnit for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ExtensionUnit for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

