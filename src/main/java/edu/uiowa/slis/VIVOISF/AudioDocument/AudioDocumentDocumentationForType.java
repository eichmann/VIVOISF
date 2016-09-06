package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentDocumentationForIterator theAudioDocumentDocumentationForIterator = (AudioDocumentDocumentationForIterator)findAncestorWithClass(this, AudioDocumentDocumentationForIterator.class);
			pageContext.getOut().print(theAudioDocumentDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

