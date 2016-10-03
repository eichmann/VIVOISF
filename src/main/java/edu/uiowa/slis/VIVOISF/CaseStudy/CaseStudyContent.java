package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyContent currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyContentIterator theCaseStudy = (CaseStudyContentIterator)findAncestorWithClass(this, CaseStudyContentIterator.class);
			pageContext.getOut().print(theCaseStudy.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for content tag ");
		}
		return SKIP_BODY;
	}
}

