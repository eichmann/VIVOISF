package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineVolumeIterator theClinicalGuideline = (ClinicalGuidelineVolumeIterator)findAncestorWithClass(this, ClinicalGuidelineVolumeIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for volume tag ");
		}
		return SKIP_BODY;
	}
}

