package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyIsbn10Iterator theCaseStudy = (CaseStudyIsbn10Iterator)findAncestorWithClass(this, CaseStudyIsbn10Iterator.class);
			pageContext.getOut().print(theCaseStudy.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

