package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudyTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudyTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudyTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaseStudyTranscriptOfIterator theCaseStudyTranscriptOfIterator = (CaseStudyTranscriptOfIterator)findAncestorWithClass(this, CaseStudyTranscriptOfIterator.class);
			pageContext.getOut().print(theCaseStudyTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

