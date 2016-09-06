package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			if (!thePublisher.commitNeeded) {
				pageContext.getOut().print(thePublisher.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			return thePublisher.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Publisher for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			thePublisher.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for abbreviation tag ");
		}
	}
}

