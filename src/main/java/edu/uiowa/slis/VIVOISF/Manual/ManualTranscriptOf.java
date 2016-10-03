package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManualTranscriptOfIterator theManualTranscriptOfIterator = (ManualTranscriptOfIterator)findAncestorWithClass(this, ManualTranscriptOfIterator.class);
			pageContext.getOut().print(theManualTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

