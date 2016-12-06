package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherRO_0002234Iterator thePublisherRO_0002234Iterator = (PublisherRO_0002234Iterator)findAncestorWithClass(this, PublisherRO_0002234Iterator.class);
			pageContext.getOut().print(thePublisherRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

