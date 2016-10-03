package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013TranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013TranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013TranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013TranscriptOfIterator theIAO_0000013TranscriptOfIterator = (IAO_0000013TranscriptOfIterator)findAncestorWithClass(this, IAO_0000013TranscriptOfIterator.class);
			pageContext.getOut().print(theIAO_0000013TranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

