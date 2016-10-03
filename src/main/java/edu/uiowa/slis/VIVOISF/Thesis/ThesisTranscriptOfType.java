package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisTranscriptOfIterator theThesisTranscriptOfIterator = (ThesisTranscriptOfIterator)findAncestorWithClass(this, ThesisTranscriptOfIterator.class);
			pageContext.getOut().print(theThesisTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

