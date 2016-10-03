package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyUri currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyUriIterator theCaseStudy = (CaseStudyUriIterator)findAncestorWithClass(this, CaseStudyUriIterator.class);
			pageContext.getOut().print(theCaseStudy.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for uri tag ");
		}
		return SKIP_BODY;
	}
}

