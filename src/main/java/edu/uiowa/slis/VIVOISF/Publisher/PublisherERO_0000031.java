package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherERO_0000031Iterator thePublisherERO_0000031Iterator = (PublisherERO_0000031Iterator)findAncestorWithClass(this, PublisherERO_0000031Iterator.class);
			pageContext.getOut().print(thePublisherERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

