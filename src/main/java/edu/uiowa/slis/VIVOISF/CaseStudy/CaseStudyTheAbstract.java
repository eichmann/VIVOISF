package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyTheAbstractIterator theCaseStudy = (CaseStudyTheAbstractIterator)findAncestorWithClass(this, CaseStudyTheAbstractIterator.class);
			pageContext.getOut().print(theCaseStudy.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

