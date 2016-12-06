package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			if (!thegeographical_region.commitNeeded) {
				pageContext.getOut().print(thegeographical_region.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			return thegeographical_region.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing geographical_region for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			geographical_region thegeographical_region = (geographical_region)findAncestorWithClass(this, geographical_region.class);
			thegeographical_region.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for placeOfPublication tag ");
		}
	}
}

