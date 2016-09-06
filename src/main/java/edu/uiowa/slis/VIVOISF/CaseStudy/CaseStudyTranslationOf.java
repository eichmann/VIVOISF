package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyTranslationOfIterator theCaseStudyTranslationOfIterator = (CaseStudyTranslationOfIterator)findAncestorWithClass(this, CaseStudyTranslationOfIterator.class);
			pageContext.getOut().print(theCaseStudyTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

