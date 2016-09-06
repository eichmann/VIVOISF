package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationSponsorsIterator theClinicalOrganizationSponsorsIterator = (ClinicalOrganizationSponsorsIterator)findAncestorWithClass(this, ClinicalOrganizationSponsorsIterator.class);
			pageContext.getOut().print(theClinicalOrganizationSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

