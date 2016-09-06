package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			if (!theFundingOrganization.commitNeeded) {
				pageContext.getOut().print(theFundingOrganization.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			return theFundingOrganization.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing FundingOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			FundingOrganization theFundingOrganization = (FundingOrganization)findAncestorWithClass(this, FundingOrganization.class);
			theFundingOrganization.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for subjectURI tag ");
		}
	}
}

