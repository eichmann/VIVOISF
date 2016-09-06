package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentRO_0000056Iterator theAudioDocumentRO_0000056Iterator = (AudioDocumentRO_0000056Iterator)findAncestorWithClass(this, AudioDocumentRO_0000056Iterator.class);
			pageContext.getOut().print(theAudioDocumentRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

