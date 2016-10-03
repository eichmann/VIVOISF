package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyDistributorIterator theCaseStudyDistributorIterator = (CaseStudyDistributorIterator)findAncestorWithClass(this, CaseStudyDistributorIterator.class);
			pageContext.getOut().print(theCaseStudyDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for distributor tag ");
		}
		return SKIP_BODY;
	}
}

