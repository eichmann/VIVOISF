package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030PlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030PlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030PlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030 theIAO_0000030 = (IAO_0000030)findAncestorWithClass(this, IAO_0000030.class);
			if (!theIAO_0000030.commitNeeded) {
				pageContext.getOut().print(theIAO_0000030.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			IAO_0000030 theIAO_0000030 = (IAO_0000030)findAncestorWithClass(this, IAO_0000030.class);
			return theIAO_0000030.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing IAO_0000030 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			IAO_0000030 theIAO_0000030 = (IAO_0000030)findAncestorWithClass(this, IAO_0000030.class);
			theIAO_0000030.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for placeOfPublication tag ");
		}
	}
}

