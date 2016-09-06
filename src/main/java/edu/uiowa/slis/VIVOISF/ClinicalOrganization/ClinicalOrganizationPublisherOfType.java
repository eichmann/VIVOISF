package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationPublisherOfIterator theClinicalOrganizationPublisherOfIterator = (ClinicalOrganizationPublisherOfIterator)findAncestorWithClass(this, ClinicalOrganizationPublisherOfIterator.class);
			pageContext.getOut().print(theClinicalOrganizationPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

