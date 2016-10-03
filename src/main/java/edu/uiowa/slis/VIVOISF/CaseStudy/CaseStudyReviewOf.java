package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyReviewOfIterator theCaseStudyReviewOfIterator = (CaseStudyReviewOfIterator)findAncestorWithClass(this, CaseStudyReviewOfIterator.class);
			pageContext.getOut().print(theCaseStudyReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

