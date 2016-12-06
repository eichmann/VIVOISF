package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			self_governing theself_governing = (self_governing)findAncestorWithClass(this, self_governing.class);
			if (!theself_governing.commitNeeded) {
				pageContext.getOut().print(theself_governing.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			self_governing theself_governing = (self_governing)findAncestorWithClass(this, self_governing.class);
			return theself_governing.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing self_governing for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			self_governing theself_governing = (self_governing)findAncestorWithClass(this, self_governing.class);
			theself_governing.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for placeOfPublication tag ");
		}
	}
}

