package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineStatusIterator theClinicalGuidelineStatusIterator = (ClinicalGuidelineStatusIterator)findAncestorWithClass(this, ClinicalGuidelineStatusIterator.class);
			pageContext.getOut().print(theClinicalGuidelineStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for status tag ");
		}
		return SKIP_BODY;
	}
}

