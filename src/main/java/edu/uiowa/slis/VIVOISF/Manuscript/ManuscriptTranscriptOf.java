package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptTranscriptOfIterator theManuscriptTranscriptOfIterator = (ManuscriptTranscriptOfIterator)findAncestorWithClass(this, ManuscriptTranscriptOfIterator.class);
			pageContext.getOut().print(theManuscriptTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

