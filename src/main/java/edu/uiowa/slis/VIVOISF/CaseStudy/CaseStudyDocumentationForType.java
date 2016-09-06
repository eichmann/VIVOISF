package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyDocumentationForIterator theCaseStudyDocumentationForIterator = (CaseStudyDocumentationForIterator)findAncestorWithClass(this, CaseStudyDocumentationForIterator.class);
			pageContext.getOut().print(theCaseStudyDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

