package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyTranslatorIterator theCaseStudyTranslatorIterator = (CaseStudyTranslatorIterator)findAncestorWithClass(this, CaseStudyTranslatorIterator.class);
			pageContext.getOut().print(theCaseStudyTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for translator tag ");
		}
		return SKIP_BODY;
	}
}

