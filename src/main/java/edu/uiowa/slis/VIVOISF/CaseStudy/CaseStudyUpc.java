package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyUpcIterator theCaseStudy = (CaseStudyUpcIterator)findAncestorWithClass(this, CaseStudyUpcIterator.class);
			pageContext.getOut().print(theCaseStudy.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for upc tag ");
		}
		return SKIP_BODY;
	}
}

