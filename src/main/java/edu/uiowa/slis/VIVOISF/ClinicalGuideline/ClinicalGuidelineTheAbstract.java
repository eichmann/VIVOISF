package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineTheAbstractIterator theClinicalGuideline = (ClinicalGuidelineTheAbstractIterator)findAncestorWithClass(this, ClinicalGuidelineTheAbstractIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

