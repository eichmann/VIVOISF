package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001PlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001PlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001PlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001 theBFO_0000001 = (BFO_0000001)findAncestorWithClass(this, BFO_0000001.class);
			if (!theBFO_0000001.commitNeeded) {
				pageContext.getOut().print(theBFO_0000001.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			BFO_0000001 theBFO_0000001 = (BFO_0000001)findAncestorWithClass(this, BFO_0000001.class);
			return theBFO_0000001.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing BFO_0000001 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			BFO_0000001 theBFO_0000001 = (BFO_0000001)findAncestorWithClass(this, BFO_0000001.class);
			theBFO_0000001.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for placeOfPublication tag ");
		}
	}
}

