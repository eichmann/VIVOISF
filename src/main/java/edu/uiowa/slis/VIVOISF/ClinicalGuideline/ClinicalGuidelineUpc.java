package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineUpcIterator theClinicalGuideline = (ClinicalGuidelineUpcIterator)findAncestorWithClass(this, ClinicalGuidelineUpcIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for upc tag ");
		}
		return SKIP_BODY;
	}
}

