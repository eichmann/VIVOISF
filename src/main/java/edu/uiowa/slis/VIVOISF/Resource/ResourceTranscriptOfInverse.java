package edu.uiowa.slis.VIVOISF.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceTranscriptOfInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResourceTranscriptOfInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceTranscriptOfInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResourceTranscriptOfInverseIterator theResourceTranscriptOfInverseIterator = (ResourceTranscriptOfInverseIterator)findAncestorWithClass(this, ResourceTranscriptOfInverseIterator.class);
			pageContext.getOut().print(theResourceTranscriptOfInverseIterator.getTranscriptOfInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

