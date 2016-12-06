package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(KindPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			if (!theKind.commitNeeded) {
				pageContext.getOut().print(theKind.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			return theKind.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Kind for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			theKind.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for placeOfPublication tag ");
		}
	}
}

