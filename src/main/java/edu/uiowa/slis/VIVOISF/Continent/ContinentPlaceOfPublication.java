package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			if (!theContinent.commitNeeded) {
				pageContext.getOut().print(theContinent.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			return theContinent.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Continent for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			theContinent.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for placeOfPublication tag ");
		}
	}
}

