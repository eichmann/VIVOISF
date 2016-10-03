package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqTranscriptOfInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqTranscriptOfInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqTranscriptOfInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqTranscriptOfInverseIterator theSeqTranscriptOfInverseIterator = (SeqTranscriptOfInverseIterator)findAncestorWithClass(this, SeqTranscriptOfInverseIterator.class);
			pageContext.getOut().print(theSeqTranscriptOfInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

