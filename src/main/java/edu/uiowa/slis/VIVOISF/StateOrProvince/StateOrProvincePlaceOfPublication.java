package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvincePlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvincePlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvincePlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			if (!theStateOrProvince.commitNeeded) {
				pageContext.getOut().print(theStateOrProvince.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			return theStateOrProvince.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing StateOrProvince for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			theStateOrProvince.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for placeOfPublication tag ");
		}
	}
}

