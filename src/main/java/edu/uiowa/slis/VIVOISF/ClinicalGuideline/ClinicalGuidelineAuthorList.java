package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineAuthorListIterator theClinicalGuidelineAuthorListIterator = (ClinicalGuidelineAuthorListIterator)findAncestorWithClass(this, ClinicalGuidelineAuthorListIterator.class);
			pageContext.getOut().print(theClinicalGuidelineAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for authorList tag ");
		}
		return SKIP_BODY;
	}
}

