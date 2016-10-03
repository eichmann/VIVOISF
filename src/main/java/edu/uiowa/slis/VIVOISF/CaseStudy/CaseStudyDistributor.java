package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyDistributorIterator theCaseStudyDistributorIterator = (CaseStudyDistributorIterator)findAncestorWithClass(this, CaseStudyDistributorIterator.class);
			pageContext.getOut().print(theCaseStudyDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for distributor tag ");
		}
		return SKIP_BODY;
	}
}

