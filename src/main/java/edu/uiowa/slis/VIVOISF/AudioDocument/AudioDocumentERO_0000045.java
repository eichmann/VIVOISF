package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentERO_0000045Iterator theAudioDocument = (AudioDocumentERO_0000045Iterator)findAncestorWithClass(this, AudioDocumentERO_0000045Iterator.class);
			pageContext.getOut().print(theAudioDocument.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

