package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyFeaturesIterator theCaseStudyFeaturesIterator = (CaseStudyFeaturesIterator)findAncestorWithClass(this, CaseStudyFeaturesIterator.class);
			pageContext.getOut().print(theCaseStudyFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for features tag ");
		}
		return SKIP_BODY;
	}
}

