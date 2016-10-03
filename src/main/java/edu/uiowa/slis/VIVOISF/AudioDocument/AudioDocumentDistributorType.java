package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentDistributorIterator theAudioDocumentDistributorIterator = (AudioDocumentDistributorIterator)findAncestorWithClass(this, AudioDocumentDistributorIterator.class);
			pageContext.getOut().print(theAudioDocumentDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for distributor tag ");
		}
		return SKIP_BODY;
	}
}

