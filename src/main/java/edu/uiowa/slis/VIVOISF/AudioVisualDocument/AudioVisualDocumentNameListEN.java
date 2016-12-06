package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameListENIterator theAudioVisualDocument = (AudioVisualDocumentNameListENIterator)findAncestorWithClass(this, AudioVisualDocumentNameListENIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

