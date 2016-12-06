package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			if (!theterritory.commitNeeded) {
				pageContext.getOut().print(theterritory.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing territory for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			return theterritory.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing territory for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			theterritory.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing territory for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for placeOfPublication tag ");
		}
	}
}

