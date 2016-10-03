package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineContributorListIterator theClinicalGuidelineContributorListIterator = (ClinicalGuidelineContributorListIterator)findAncestorWithClass(this, ClinicalGuidelineContributorListIterator.class);
			pageContext.getOut().print(theClinicalGuidelineContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

