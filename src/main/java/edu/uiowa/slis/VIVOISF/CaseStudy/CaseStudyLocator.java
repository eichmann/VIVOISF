package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyLocatorIterator theCaseStudy = (CaseStudyLocatorIterator)findAncestorWithClass(this, CaseStudyLocatorIterator.class);
			pageContext.getOut().print(theCaseStudy.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for locator tag ");
		}
		return SKIP_BODY;
	}
}

