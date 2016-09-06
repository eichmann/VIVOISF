package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyFeaturesIterator theCaseStudyFeaturesIterator = (CaseStudyFeaturesIterator)findAncestorWithClass(this, CaseStudyFeaturesIterator.class);
			pageContext.getOut().print(theCaseStudyFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for features tag ");
		}
		return SKIP_BODY;
	}
}

