package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentIsbn13Iterator theAudioDocument = (AudioDocumentIsbn13Iterator)findAncestorWithClass(this, AudioDocumentIsbn13Iterator.class);
			pageContext.getOut().print(theAudioDocument.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

