package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationTranscriptOfIterator theLegislationTranscriptOfIterator = (LegislationTranscriptOfIterator)findAncestorWithClass(this, LegislationTranscriptOfIterator.class);
			pageContext.getOut().print(theLegislationTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

