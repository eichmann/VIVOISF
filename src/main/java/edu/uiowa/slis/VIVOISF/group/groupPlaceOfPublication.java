package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(groupPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			if (!thegroup.commitNeeded) {
				pageContext.getOut().print(thegroup.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing group for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			return thegroup.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing group for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			group thegroup = (group)findAncestorWithClass(this, group.class);
			thegroup.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing group for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for placeOfPublication tag ");
		}
	}
}

