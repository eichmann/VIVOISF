package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineEditionIterator theClinicalGuideline = (ClinicalGuidelineEditionIterator)findAncestorWithClass(this, ClinicalGuidelineEditionIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for edition tag ");
		}
		return SKIP_BODY;
	}
}

