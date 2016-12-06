package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPublisherIterator theConferencePaperPublisherIterator = (ConferencePaperPublisherIterator)findAncestorWithClass(this, ConferencePaperPublisherIterator.class);
			pageContext.getOut().print(theConferencePaperPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for publisher tag ");
		}
		return SKIP_BODY;
	}
}

