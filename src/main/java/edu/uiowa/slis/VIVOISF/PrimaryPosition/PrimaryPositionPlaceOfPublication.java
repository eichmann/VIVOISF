package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			if (!thePrimaryPosition.commitNeeded) {
				pageContext.getOut().print(thePrimaryPosition.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			return thePrimaryPosition.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing PrimaryPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			PrimaryPosition thePrimaryPosition = (PrimaryPosition)findAncestorWithClass(this, PrimaryPosition.class);
			thePrimaryPosition.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for placeOfPublication tag ");
		}
	}
}

