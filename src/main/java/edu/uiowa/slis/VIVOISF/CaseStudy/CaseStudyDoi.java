package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyDoiIterator theCaseStudy = (CaseStudyDoiIterator)findAncestorWithClass(this, CaseStudyDoiIterator.class);
			pageContext.getOut().print(theCaseStudy.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for doi tag ");
		}
		return SKIP_BODY;
	}
}

