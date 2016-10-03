package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentLccnIterator theAudioDocument = (AudioDocumentLccnIterator)findAncestorWithClass(this, AudioDocumentLccnIterator.class);
			pageContext.getOut().print(theAudioDocument.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for lccn tag ");
		}
		return SKIP_BODY;
	}
}

