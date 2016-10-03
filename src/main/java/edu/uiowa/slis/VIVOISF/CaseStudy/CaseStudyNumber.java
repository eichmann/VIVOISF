package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyNumberIterator theCaseStudy = (CaseStudyNumberIterator)findAncestorWithClass(this, CaseStudyNumberIterator.class);
			pageContext.getOut().print(theCaseStudy.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for number tag ");
		}
		return SKIP_BODY;
	}
}

