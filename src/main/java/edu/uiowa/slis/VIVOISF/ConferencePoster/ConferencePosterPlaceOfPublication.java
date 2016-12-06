package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			if (!theConferencePoster.commitNeeded) {
				pageContext.getOut().print(theConferencePoster.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			return theConferencePoster.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePoster for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			theConferencePoster.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for placeOfPublication tag ");
		}
	}
}

