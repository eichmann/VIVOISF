package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(areaPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			if (!thearea.commitNeeded) {
				pageContext.getOut().print(thearea.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing area for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			return thearea.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing area for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			thearea.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing area for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for placeOfPublication tag ");
		}
	}
}

