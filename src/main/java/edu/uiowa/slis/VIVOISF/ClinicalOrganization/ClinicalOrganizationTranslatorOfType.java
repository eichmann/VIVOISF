package edu.uiowa.slis.VIVOISF.ClinicalOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalOrganizationTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalOrganizationTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalOrganizationTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalOrganizationTranslatorOfIterator theClinicalOrganizationTranslatorOfIterator = (ClinicalOrganizationTranslatorOfIterator)findAncestorWithClass(this, ClinicalOrganizationTranslatorOfIterator.class);
			pageContext.getOut().print(theClinicalOrganizationTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalOrganization for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalOrganization for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

