package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineTranscriptOfIterator theClinicalGuidelineTranscriptOfIterator = (ClinicalGuidelineTranscriptOfIterator)findAncestorWithClass(this, ClinicalGuidelineTranscriptOfIterator.class);
			pageContext.getOut().print(theClinicalGuidelineTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

