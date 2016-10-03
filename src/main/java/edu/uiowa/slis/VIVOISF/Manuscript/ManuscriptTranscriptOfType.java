package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptTranscriptOfIterator theManuscriptTranscriptOfIterator = (ManuscriptTranscriptOfIterator)findAncestorWithClass(this, ManuscriptTranscriptOfIterator.class);
			pageContext.getOut().print(theManuscriptTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

