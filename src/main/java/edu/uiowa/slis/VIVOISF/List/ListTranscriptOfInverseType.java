package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListTranscriptOfInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListTranscriptOfInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ListTranscriptOfInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ListTranscriptOfInverseIterator theListTranscriptOfInverseIterator = (ListTranscriptOfInverseIterator)findAncestorWithClass(this, ListTranscriptOfInverseIterator.class);
			pageContext.getOut().print(theListTranscriptOfInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing List for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

