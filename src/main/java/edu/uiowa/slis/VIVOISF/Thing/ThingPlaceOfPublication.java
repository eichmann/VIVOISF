package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			if (!theThing.commitNeeded) {
				pageContext.getOut().print(theThing.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			return theThing.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Thing for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			theThing.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for placeOfPublication tag ");
		}
	}
}

