package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyGtin14Iterator theCaseStudy = (CaseStudyGtin14Iterator)findAncestorWithClass(this, CaseStudyGtin14Iterator.class);
			pageContext.getOut().print(theCaseStudy.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

