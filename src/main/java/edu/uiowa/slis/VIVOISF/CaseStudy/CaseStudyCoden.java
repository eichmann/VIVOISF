package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyCodenIterator theCaseStudy = (CaseStudyCodenIterator)findAncestorWithClass(this, CaseStudyCodenIterator.class);
			pageContext.getOut().print(theCaseStudy.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for coden tag ");
		}
		return SKIP_BODY;
	}
}

