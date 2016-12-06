package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			if (!thePublisher.commitNeeded) {
				pageContext.getOut().print(thePublisher.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			return thePublisher.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Publisher for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Publisher thePublisher = (Publisher)findAncestorWithClass(this, Publisher.class);
			thePublisher.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for placeOfPublication tag ");
		}
	}
}

