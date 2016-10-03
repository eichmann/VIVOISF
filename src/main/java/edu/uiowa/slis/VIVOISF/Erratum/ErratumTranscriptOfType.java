package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumTranscriptOfIterator theErratumTranscriptOfIterator = (ErratumTranscriptOfIterator)findAncestorWithClass(this, ErratumTranscriptOfIterator.class);
			pageContext.getOut().print(theErratumTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

