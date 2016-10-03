package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineLocatorIterator theClinicalGuideline = (ClinicalGuidelineLocatorIterator)findAncestorWithClass(this, ClinicalGuidelineLocatorIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for locator tag ");
		}
		return SKIP_BODY;
	}
}

