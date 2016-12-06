package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			if (!theConference.commitNeeded) {
				pageContext.getOut().print(theConference.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			return theConference.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Conference for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			theConference.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for placeOfPublication tag ");
		}
	}
}

