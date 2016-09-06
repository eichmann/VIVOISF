package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyStatusIterator theCaseStudyStatusIterator = (CaseStudyStatusIterator)findAncestorWithClass(this, CaseStudyStatusIterator.class);
			pageContext.getOut().print(theCaseStudyStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for status tag ");
		}
		return SKIP_BODY;
	}
}

