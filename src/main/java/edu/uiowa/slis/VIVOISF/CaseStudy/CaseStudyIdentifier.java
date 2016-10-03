package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyIdentifierIterator theCaseStudy = (CaseStudyIdentifierIterator)findAncestorWithClass(this, CaseStudyIdentifierIterator.class);
			pageContext.getOut().print(theCaseStudy.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for identifier tag ");
		}
		return SKIP_BODY;
	}
}

