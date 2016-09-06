package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyPmidIterator theCaseStudy = (CaseStudyPmidIterator)findAncestorWithClass(this, CaseStudyPmidIterator.class);
			pageContext.getOut().print(theCaseStudy.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for pmid tag ");
		}
		return SKIP_BODY;
	}
}

