package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			if (!thePublisher.commitNeeded) {
				pageContext.getOut().print(thePublisher.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			return thePublisher.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Publisher for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			thePublisher.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hideFromDisplay tag ");
		}
	}
}

