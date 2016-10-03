package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentOwnerIterator theAudioDocumentOwnerIterator = (AudioDocumentOwnerIterator)findAncestorWithClass(this, AudioDocumentOwnerIterator.class);
			pageContext.getOut().print(theAudioDocumentOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for owner tag ");
		}
		return SKIP_BODY;
	}
}

