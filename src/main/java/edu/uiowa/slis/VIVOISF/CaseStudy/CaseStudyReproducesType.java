package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyReproducesIterator theCaseStudyReproducesIterator = (CaseStudyReproducesIterator)findAncestorWithClass(this, CaseStudyReproducesIterator.class);
			pageContext.getOut().print(theCaseStudyReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

