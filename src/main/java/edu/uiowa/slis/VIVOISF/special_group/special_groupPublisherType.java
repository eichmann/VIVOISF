package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupPublisherIterator thespecial_groupPublisherIterator = (special_groupPublisherIterator)findAncestorWithClass(this, special_groupPublisherIterator.class);
			pageContext.getOut().print(thespecial_groupPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for publisher tag ");
		}
		return SKIP_BODY;
	}
}

