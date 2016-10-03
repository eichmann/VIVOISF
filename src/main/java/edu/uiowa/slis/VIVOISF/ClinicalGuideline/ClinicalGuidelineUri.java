package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineUriIterator theClinicalGuideline = (ClinicalGuidelineUriIterator)findAncestorWithClass(this, ClinicalGuidelineUriIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for uri tag ");
		}
		return SKIP_BODY;
	}
}

