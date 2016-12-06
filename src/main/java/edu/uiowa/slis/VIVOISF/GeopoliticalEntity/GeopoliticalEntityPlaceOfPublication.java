package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			if (!theGeopoliticalEntity.commitNeeded) {
				pageContext.getOut().print(theGeopoliticalEntity.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			return theGeopoliticalEntity.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeopoliticalEntity for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			theGeopoliticalEntity.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for placeOfPublication tag ");
		}
	}
}

