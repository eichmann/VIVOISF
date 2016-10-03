package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentTranscriptOfIterator thePatentTranscriptOfIterator = (PatentTranscriptOfIterator)findAncestorWithClass(this, PatentTranscriptOfIterator.class);
			pageContext.getOut().print(thePatentTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}
