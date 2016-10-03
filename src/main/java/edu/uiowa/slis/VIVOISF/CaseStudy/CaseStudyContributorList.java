package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyContributorListIterator theCaseStudyContributorListIterator = (CaseStudyContributorListIterator)findAncestorWithClass(this, CaseStudyContributorListIterator.class);
			pageContext.getOut().print(theCaseStudyContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

