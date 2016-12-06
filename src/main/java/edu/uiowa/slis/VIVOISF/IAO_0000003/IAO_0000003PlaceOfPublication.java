package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003PlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003PlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003PlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003 theIAO_0000003 = (IAO_0000003)findAncestorWithClass(this, IAO_0000003.class);
			if (!theIAO_0000003.commitNeeded) {
				pageContext.getOut().print(theIAO_0000003.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			IAO_0000003 theIAO_0000003 = (IAO_0000003)findAncestorWithClass(this, IAO_0000003.class);
			return theIAO_0000003.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing IAO_0000003 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			IAO_0000003 theIAO_0000003 = (IAO_0000003)findAncestorWithClass(this, IAO_0000003.class);
			theIAO_0000003.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for placeOfPublication tag ");
		}
	}
}

