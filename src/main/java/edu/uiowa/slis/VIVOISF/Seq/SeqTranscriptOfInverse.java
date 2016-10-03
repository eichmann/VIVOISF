package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqTranscriptOfInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqTranscriptOfInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqTranscriptOfInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqTranscriptOfInverseIterator theSeqTranscriptOfInverseIterator = (SeqTranscriptOfInverseIterator)findAncestorWithClass(this, SeqTranscriptOfInverseIterator.class);
			pageContext.getOut().print(theSeqTranscriptOfInverseIterator.getTranscriptOfInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

