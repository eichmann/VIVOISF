package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyNumPagesIterator theCaseStudy = (CaseStudyNumPagesIterator)findAncestorWithClass(this, CaseStudyNumPagesIterator.class);
			pageContext.getOut().print(theCaseStudy.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for numPages tag ");
		}
		return SKIP_BODY;
	}
}

