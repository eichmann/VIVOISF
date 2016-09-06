package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyPresentedAtIterator theCaseStudyPresentedAtIterator = (CaseStudyPresentedAtIterator)findAncestorWithClass(this, CaseStudyPresentedAtIterator.class);
			pageContext.getOut().print(theCaseStudyPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

