package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyAsinIterator theCaseStudy = (CaseStudyAsinIterator)findAncestorWithClass(this, CaseStudyAsinIterator.class);
			pageContext.getOut().print(theCaseStudy.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for asin tag ");
		}
		return SKIP_BODY;
	}
}

