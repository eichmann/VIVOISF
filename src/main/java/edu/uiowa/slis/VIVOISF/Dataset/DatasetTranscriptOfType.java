package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetTranscriptOfIterator theDatasetTranscriptOfIterator = (DatasetTranscriptOfIterator)findAncestorWithClass(this, DatasetTranscriptOfIterator.class);
			pageContext.getOut().print(theDatasetTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

