package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentIsbn10Iterator theAudioDocument = (AudioDocumentIsbn10Iterator)findAncestorWithClass(this, AudioDocumentIsbn10Iterator.class);
			pageContext.getOut().print(theAudioDocument.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

