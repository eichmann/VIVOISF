package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			if (!theeconomic_region.commitNeeded) {
				pageContext.getOut().print(theeconomic_region.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			return theeconomic_region.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing economic_region for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			theeconomic_region.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for placeOfPublication tag ");
		}
	}
}

