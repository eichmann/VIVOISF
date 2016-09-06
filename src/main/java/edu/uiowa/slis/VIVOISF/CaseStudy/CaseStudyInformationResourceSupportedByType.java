package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyInformationResourceSupportedByIterator theCaseStudyInformationResourceSupportedByIterator = (CaseStudyInformationResourceSupportedByIterator)findAncestorWithClass(this, CaseStudyInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theCaseStudyInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

