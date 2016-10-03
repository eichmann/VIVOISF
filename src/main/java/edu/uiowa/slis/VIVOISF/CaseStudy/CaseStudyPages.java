package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyPages currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyPagesIterator theCaseStudy = (CaseStudyPagesIterator)findAncestorWithClass(this, CaseStudyPagesIterator.class);
			pageContext.getOut().print(theCaseStudy.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for pages tag ");
		}
		return SKIP_BODY;
	}
}

