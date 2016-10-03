package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentProducerIterator theAudioDocumentProducerIterator = (AudioDocumentProducerIterator)findAncestorWithClass(this, AudioDocumentProducerIterator.class);
			pageContext.getOut().print(theAudioDocumentProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for producer tag ");
		}
		return SKIP_BODY;
	}
}

