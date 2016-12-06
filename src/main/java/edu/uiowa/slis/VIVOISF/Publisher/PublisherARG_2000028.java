package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherARG_2000028Iterator thePublisherARG_2000028Iterator = (PublisherARG_2000028Iterator)findAncestorWithClass(this, PublisherARG_2000028Iterator.class);
			pageContext.getOut().print(thePublisherARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

