package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379Publisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379Publisher currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379Publisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379PublisherIterator theARG_2000379PublisherIterator = (ARG_2000379PublisherIterator)findAncestorWithClass(this, ARG_2000379PublisherIterator.class);
			pageContext.getOut().print(theARG_2000379PublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for publisher tag ");
		}
		return SKIP_BODY;
	}
}

