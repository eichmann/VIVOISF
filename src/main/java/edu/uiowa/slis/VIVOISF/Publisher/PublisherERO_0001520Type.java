package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherERO_0001520Iterator thePublisherERO_0001520Iterator = (PublisherERO_0001520Iterator)findAncestorWithClass(this, PublisherERO_0001520Iterator.class);
			pageContext.getOut().print(thePublisherERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

