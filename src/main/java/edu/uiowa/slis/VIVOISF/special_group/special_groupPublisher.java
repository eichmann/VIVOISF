package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupPublisherIterator thespecial_groupPublisherIterator = (special_groupPublisherIterator)findAncestorWithClass(this, special_groupPublisherIterator.class);
			pageContext.getOut().print(thespecial_groupPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for publisher tag ");
		}
		return SKIP_BODY;
	}
}

