package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyShortTitleIterator theCaseStudy = (CaseStudyShortTitleIterator)findAncestorWithClass(this, CaseStudyShortTitleIterator.class);
			pageContext.getOut().print(theCaseStudy.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

