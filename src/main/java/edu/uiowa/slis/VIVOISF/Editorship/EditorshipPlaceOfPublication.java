package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			if (!theEditorship.commitNeeded) {
				pageContext.getOut().print(theEditorship.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			return theEditorship.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Editorship for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			theEditorship.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for placeOfPublication tag ");
		}
	}
}

