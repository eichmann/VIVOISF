package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineAuthorListIterator theClinicalGuidelineAuthorListIterator = (ClinicalGuidelineAuthorListIterator)findAncestorWithClass(this, ClinicalGuidelineAuthorListIterator.class);
			pageContext.getOut().print(theClinicalGuidelineAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for authorList tag ");
		}
		return SKIP_BODY;
	}
}

