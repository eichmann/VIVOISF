package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineIdentifierIterator theClinicalGuideline = (ClinicalGuidelineIdentifierIterator)findAncestorWithClass(this, ClinicalGuidelineIdentifierIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for identifier tag ");
		}
		return SKIP_BODY;
	}
}
