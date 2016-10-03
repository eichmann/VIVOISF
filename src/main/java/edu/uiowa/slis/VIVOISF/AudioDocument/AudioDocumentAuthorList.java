package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentAuthorListIterator theAudioDocumentAuthorListIterator = (AudioDocumentAuthorListIterator)findAncestorWithClass(this, AudioDocumentAuthorListIterator.class);
			pageContext.getOut().print(theAudioDocumentAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for authorList tag ");
		}
		return SKIP_BODY;
	}
}

