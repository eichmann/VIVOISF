package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyIsbn13Iterator theCaseStudy = (CaseStudyIsbn13Iterator)findAncestorWithClass(this, CaseStudyIsbn13Iterator.class);
			pageContext.getOut().print(theCaseStudy.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

