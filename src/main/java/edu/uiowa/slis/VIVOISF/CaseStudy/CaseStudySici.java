package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudySici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudySici currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudySici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudySiciIterator theCaseStudy = (CaseStudySiciIterator)findAncestorWithClass(this, CaseStudySiciIterator.class);
			pageContext.getOut().print(theCaseStudy.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for sici tag ");
		}
		return SKIP_BODY;
	}
}

