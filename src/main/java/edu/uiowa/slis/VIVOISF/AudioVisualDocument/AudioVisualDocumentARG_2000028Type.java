package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentARG_2000028Iterator theAudioVisualDocumentARG_2000028Iterator = (AudioVisualDocumentARG_2000028Iterator)findAncestorWithClass(this, AudioVisualDocumentARG_2000028Iterator.class);
			pageContext.getOut().print(theAudioVisualDocumentARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

