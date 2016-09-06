package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudyVolumeIterator theCaseStudy = (CaseStudyVolumeIterator)findAncestorWithClass(this, CaseStudyVolumeIterator.class);
			pageContext.getOut().print(theCaseStudy.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for volume tag ");
		}
		return SKIP_BODY;
	}
}

