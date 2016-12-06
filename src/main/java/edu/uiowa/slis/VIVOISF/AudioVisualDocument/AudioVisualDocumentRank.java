package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentRank currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentRankIterator theAudioVisualDocument = (AudioVisualDocumentRankIterator)findAncestorWithClass(this, AudioVisualDocumentRankIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for rank tag ");
		}
		return SKIP_BODY;
	}
}

