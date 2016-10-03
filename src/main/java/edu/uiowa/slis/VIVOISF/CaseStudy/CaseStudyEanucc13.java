package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyEanucc13Iterator theCaseStudy = (CaseStudyEanucc13Iterator)findAncestorWithClass(this, CaseStudyEanucc13Iterator.class);
			pageContext.getOut().print(theCaseStudy.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

