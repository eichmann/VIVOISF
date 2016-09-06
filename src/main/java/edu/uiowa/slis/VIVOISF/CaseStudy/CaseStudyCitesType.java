package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyCitesIterator theCaseStudyCitesIterator = (CaseStudyCitesIterator)findAncestorWithClass(this, CaseStudyCitesIterator.class);
			pageContext.getOut().print(theCaseStudyCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for cites tag ");
		}
		return SKIP_BODY;
	}
}

