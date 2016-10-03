package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsTranscriptOfIterator theProceedingsTranscriptOfIterator = (ProceedingsTranscriptOfIterator)findAncestorWithClass(this, ProceedingsTranscriptOfIterator.class);
			pageContext.getOut().print(theProceedingsTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

