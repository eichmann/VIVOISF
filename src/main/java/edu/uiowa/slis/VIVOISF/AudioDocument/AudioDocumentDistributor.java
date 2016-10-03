package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentDistributorIterator theAudioDocumentDistributorIterator = (AudioDocumentDistributorIterator)findAncestorWithClass(this, AudioDocumentDistributorIterator.class);
			pageContext.getOut().print(theAudioDocumentDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for distributor tag ");
		}
		return SKIP_BODY;
	}
}

