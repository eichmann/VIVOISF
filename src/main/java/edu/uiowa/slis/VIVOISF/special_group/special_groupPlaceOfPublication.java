package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			if (!thespecial_group.commitNeeded) {
				pageContext.getOut().print(thespecial_group.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			return thespecial_group.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing special_group for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			thespecial_group.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for placeOfPublication tag ");
		}
	}
}

