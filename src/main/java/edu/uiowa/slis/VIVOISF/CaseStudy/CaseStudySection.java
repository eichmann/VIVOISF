package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudySection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudySection currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudySection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudySectionIterator theCaseStudy = (CaseStudySectionIterator)findAncestorWithClass(this, CaseStudySectionIterator.class);
			pageContext.getOut().print(theCaseStudy.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for section tag ");
		}
		return SKIP_BODY;
	}
}

