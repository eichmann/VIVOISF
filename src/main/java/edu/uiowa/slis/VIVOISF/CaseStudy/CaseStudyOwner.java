package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyOwnerIterator theCaseStudyOwnerIterator = (CaseStudyOwnerIterator)findAncestorWithClass(this, CaseStudyOwnerIterator.class);
			pageContext.getOut().print(theCaseStudyOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for owner tag ");
		}
		return SKIP_BODY;
	}
}

