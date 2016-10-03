package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationRecipientInverseIterator theResearchOrganizationRecipientInverseIterator = (ResearchOrganizationRecipientInverseIterator)findAncestorWithClass(this, ResearchOrganizationRecipientInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for recipient tag ");
		}
		return SKIP_BODY;
	}
}

