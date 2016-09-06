package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentARG_0000001Iterator theAudioDocument = (AudioDocumentARG_0000001Iterator)findAncestorWithClass(this, AudioDocumentARG_0000001Iterator.class);
			pageContext.getOut().print(theAudioDocument.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

