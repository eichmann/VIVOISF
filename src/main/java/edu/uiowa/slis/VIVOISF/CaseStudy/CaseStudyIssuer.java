package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyIssuerIterator theCaseStudyIssuerIterator = (CaseStudyIssuerIterator)findAncestorWithClass(this, CaseStudyIssuerIterator.class);
			pageContext.getOut().print(theCaseStudyIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for issuer tag ");
		}
		return SKIP_BODY;
	}
}

