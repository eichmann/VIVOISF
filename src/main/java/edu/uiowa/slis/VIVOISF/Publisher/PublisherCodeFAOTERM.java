package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeFAOTERMIterator thePublisher = (PublisherCodeFAOTERMIterator)findAncestorWithClass(this, PublisherCodeFAOTERMIterator.class);
			pageContext.getOut().print(thePublisher.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

