package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationProducerInverseIterator theClinicalOrganizationProducerInverseIterator = (ClinicalOrganizationProducerInverseIterator)findAncestorWithClass(this, ClinicalOrganizationProducerInverseIterator.class);
			pageContext.getOut().print(theClinicalOrganizationProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for producer tag ");
		}
		return SKIP_BODY;
	}
}

