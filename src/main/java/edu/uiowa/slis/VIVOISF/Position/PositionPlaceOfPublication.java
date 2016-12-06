package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			if (!thePosition.commitNeeded) {
				pageContext.getOut().print(thePosition.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Position for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			return thePosition.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Position for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Position thePosition = (Position)findAncestorWithClass(this, Position.class);
			thePosition.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Position for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for placeOfPublication tag ");
		}
	}
}

