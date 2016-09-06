package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyPresentedAtIterator theCaseStudyPresentedAtIterator = (CaseStudyPresentedAtIterator)findAncestorWithClass(this, CaseStudyPresentedAtIterator.class);
			pageContext.getOut().print(theCaseStudyPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

