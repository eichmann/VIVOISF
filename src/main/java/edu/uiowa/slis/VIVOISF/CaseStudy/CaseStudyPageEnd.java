package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyPageEndIterator theCaseStudy = (CaseStudyPageEndIterator)findAncestorWithClass(this, CaseStudyPageEndIterator.class);
			pageContext.getOut().print(theCaseStudy.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

