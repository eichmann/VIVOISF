package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyCitedByIterator theCaseStudyCitedByIterator = (CaseStudyCitedByIterator)findAncestorWithClass(this, CaseStudyCitedByIterator.class);
			pageContext.getOut().print(theCaseStudyCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

