package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherCodeDBPediaIDIterator thePublisher = (PublisherCodeDBPediaIDIterator)findAncestorWithClass(this, PublisherCodeDBPediaIDIterator.class);
			pageContext.getOut().print(thePublisher.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

