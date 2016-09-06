package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			if (!thePublisher.commitNeeded) {
				pageContext.getOut().print(thePublisher.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			return thePublisher.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Publisher for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			thePublisher.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for overview tag ");
		}
	}
}

