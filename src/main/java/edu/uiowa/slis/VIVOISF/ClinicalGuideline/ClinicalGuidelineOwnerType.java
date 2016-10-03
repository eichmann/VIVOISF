package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineOwnerIterator theClinicalGuidelineOwnerIterator = (ClinicalGuidelineOwnerIterator)findAncestorWithClass(this, ClinicalGuidelineOwnerIterator.class);
			pageContext.getOut().print(theClinicalGuidelineOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for owner tag ");
		}
		return SKIP_BODY;
	}
}

