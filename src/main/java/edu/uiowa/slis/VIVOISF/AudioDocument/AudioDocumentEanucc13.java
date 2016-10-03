package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentEanucc13Iterator theAudioDocument = (AudioDocumentEanucc13Iterator)findAncestorWithClass(this, AudioDocumentEanucc13Iterator.class);
			pageContext.getOut().print(theAudioDocument.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

