package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyShortDescriptionIterator theCaseStudy = (CaseStudyShortDescriptionIterator)findAncestorWithClass(this, CaseStudyShortDescriptionIterator.class);
			pageContext.getOut().print(theCaseStudy.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

