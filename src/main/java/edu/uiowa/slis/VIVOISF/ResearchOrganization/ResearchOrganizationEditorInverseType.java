package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationEditorInverseIterator theResearchOrganizationEditorInverseIterator = (ResearchOrganizationEditorInverseIterator)findAncestorWithClass(this, ResearchOrganizationEditorInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for editor tag ");
		}
		return SKIP_BODY;
	}
}

