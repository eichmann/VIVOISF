package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyDocumentationForIterator theCaseStudyDocumentationForIterator = (CaseStudyDocumentationForIterator)findAncestorWithClass(this, CaseStudyDocumentationForIterator.class);
			pageContext.getOut().print(theCaseStudyDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

