package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationEditorInverseIterator theOrganizationEditorInverseIterator = (OrganizationEditorInverseIterator)findAncestorWithClass(this, OrganizationEditorInverseIterator.class);
			pageContext.getOut().print(theOrganizationEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for editor tag ");
		}
		return SKIP_BODY;
	}
}

