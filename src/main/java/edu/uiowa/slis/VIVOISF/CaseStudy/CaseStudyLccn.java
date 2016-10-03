package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyLccnIterator theCaseStudy = (CaseStudyLccnIterator)findAncestorWithClass(this, CaseStudyLccnIterator.class);
			pageContext.getOut().print(theCaseStudy.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for lccn tag ");
		}
		return SKIP_BODY;
	}
}

