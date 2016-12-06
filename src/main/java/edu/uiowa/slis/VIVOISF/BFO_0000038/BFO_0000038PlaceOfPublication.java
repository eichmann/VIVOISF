package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038PlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038PlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038PlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038 theBFO_0000038 = (BFO_0000038)findAncestorWithClass(this, BFO_0000038.class);
			if (!theBFO_0000038.commitNeeded) {
				pageContext.getOut().print(theBFO_0000038.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			BFO_0000038 theBFO_0000038 = (BFO_0000038)findAncestorWithClass(this, BFO_0000038.class);
			return theBFO_0000038.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing BFO_0000038 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			BFO_0000038 theBFO_0000038 = (BFO_0000038)findAncestorWithClass(this, BFO_0000038.class);
			theBFO_0000038.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for placeOfPublication tag ");
		}
	}
}

