package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentReproducesIterator theAudioDocumentReproducesIterator = (AudioDocumentReproducesIterator)findAncestorWithClass(this, AudioDocumentReproducesIterator.class);
			pageContext.getOut().print(theAudioDocumentReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

