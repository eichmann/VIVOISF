package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentIAO_0000136Iterator theAudioDocumentIAO_0000136Iterator = (AudioDocumentIAO_0000136Iterator)findAncestorWithClass(this, AudioDocumentIAO_0000136Iterator.class);
			pageContext.getOut().print(theAudioDocumentIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

