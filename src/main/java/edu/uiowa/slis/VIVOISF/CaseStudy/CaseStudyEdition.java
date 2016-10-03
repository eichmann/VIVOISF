package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyEditionIterator theCaseStudy = (CaseStudyEditionIterator)findAncestorWithClass(this, CaseStudyEditionIterator.class);
			pageContext.getOut().print(theCaseStudy.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for edition tag ");
		}
		return SKIP_BODY;
	}
}

