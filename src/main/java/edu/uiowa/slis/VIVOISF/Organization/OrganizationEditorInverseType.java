package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationEditorInverseIterator theOrganizationEditorInverseIterator = (OrganizationEditorInverseIterator)findAncestorWithClass(this, OrganizationEditorInverseIterator.class);
			pageContext.getOut().print(theOrganizationEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for editor tag ");
		}
		return SKIP_BODY;
	}
}

