package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyReproducedInIterator theCaseStudyReproducedInIterator = (CaseStudyReproducedInIterator)findAncestorWithClass(this, CaseStudyReproducedInIterator.class);
			pageContext.getOut().print(theCaseStudyReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

