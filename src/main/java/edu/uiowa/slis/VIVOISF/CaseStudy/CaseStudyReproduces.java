package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyReproducesIterator theCaseStudyReproducesIterator = (CaseStudyReproducesIterator)findAncestorWithClass(this, CaseStudyReproducesIterator.class);
			pageContext.getOut().print(theCaseStudyReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

