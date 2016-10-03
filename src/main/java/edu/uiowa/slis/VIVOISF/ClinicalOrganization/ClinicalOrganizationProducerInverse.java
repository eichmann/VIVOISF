package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationProducerInverseIterator theClinicalOrganizationProducerInverseIterator = (ClinicalOrganizationProducerInverseIterator)findAncestorWithClass(this, ClinicalOrganizationProducerInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for producer tag ");
		}
		return SKIP_BODY;
	}
}

