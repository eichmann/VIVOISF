package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationEditorInverseIterator theFundingOrganizationEditorInverseIterator = (FundingOrganizationEditorInverseIterator)findAncestorWithClass(this, FundingOrganizationEditorInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for editor tag ");
		}
		return SKIP_BODY;
	}
}

