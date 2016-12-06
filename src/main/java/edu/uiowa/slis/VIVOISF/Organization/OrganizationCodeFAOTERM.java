package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCodeFAOTERMIterator theOrganization = (OrganizationCodeFAOTERMIterator)findAncestorWithClass(this, OrganizationCodeFAOTERMIterator.class);
			pageContext.getOut().print(theOrganization.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

