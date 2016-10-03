package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListTranscriptOfInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListTranscriptOfInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ListTranscriptOfInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListTranscriptOfInverseIterator theListTranscriptOfInverseIterator = (ListTranscriptOfInverseIterator)findAncestorWithClass(this, ListTranscriptOfInverseIterator.class);
			pageContext.getOut().print(theListTranscriptOfInverseIterator.getTranscriptOfInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing List for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

