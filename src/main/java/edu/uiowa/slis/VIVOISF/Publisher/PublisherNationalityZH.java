package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherNationalityZHIterator thePublisher = (PublisherNationalityZHIterator)findAncestorWithClass(this, PublisherNationalityZHIterator.class);
			pageContext.getOut().print(thePublisher.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

