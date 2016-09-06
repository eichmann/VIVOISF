package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			if (!theClinicalOrganization.commitNeeded) {
				pageContext.getOut().print(theClinicalOrganization.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			return theClinicalOrganization.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing ClinicalOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			ClinicalOrganization theClinicalOrganization = (ClinicalOrganization)findAncestorWithClass(this, ClinicalOrganization.class);
			theClinicalOrganization.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for overview tag ");
		}
	}
}

