package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationEditorInverseIterator theAssociationEditorInverseIterator = (AssociationEditorInverseIterator)findAncestorWithClass(this, AssociationEditorInverseIterator.class);
			pageContext.getOut().print(theAssociationEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for editor tag ");
		}
		return SKIP_BODY;
	}
}

