package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyPageStartIterator theCaseStudy = (CaseStudyPageStartIterator)findAncestorWithClass(this, CaseStudyPageStartIterator.class);
			pageContext.getOut().print(theCaseStudy.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

