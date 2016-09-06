package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			if (!thePublisher.commitNeeded) {
				pageContext.getOut().print(thePublisher.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			return thePublisher.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Publisher for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			thePublisher.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for label tag ");
		}
	}
}

